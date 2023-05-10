/*
 * Copyright 2023 Sasikanth Miriyampalli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.sasikanth.rss.reader.home

import dev.sasikanth.rss.reader.database.Feed
import dev.sasikanth.rss.reader.database.PostWithMetadata
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class HomeState(
  val feeds: Flow<List<Feed>>,
  val posts: Flow<List<PostWithMetadata>>,
  val selectedFeed: Feed?,
  val loadingState: HomeLoadingState
) {

  companion object {

    val DEFAULT =
      HomeState(
        feeds = emptyFlow(),
        posts = emptyFlow(),
        selectedFeed = null,
        loadingState = HomeLoadingState.Idle
      )
  }
}

sealed interface HomeLoadingState {
  object Idle : HomeLoadingState

  object Loading : HomeLoadingState

  data class Error(val errorMessage: String) : HomeLoadingState
}