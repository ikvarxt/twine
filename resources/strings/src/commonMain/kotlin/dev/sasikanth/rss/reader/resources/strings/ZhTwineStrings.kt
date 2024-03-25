/*
 * Copyright 2024 Sasikanth Miriyampalli
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
package dev.sasikanth.rss.reader.resources.strings

import cafe.adriel.lyricist.LyricistStrings

@LyricistStrings(languageTag = Locales.ZH, default = false)
val ZhTwineStrings =
    TwineStrings(
        appName = "Twine",
        postSourceUnknown = "未知",
        buttonAll = "全部",
        buttonAddFeed = "添加订阅",
        buttonGoBack = "返回",
        buttonCancel = "取消",
        buttonAdd = "添加",
        buttonChange = "完成",
        feedEntryHint = "输入订阅地址",
        share = "分享",
        scrollToTop = "回到上面",
        noFeeds = "现在没有文章！",
        swipeUpGetStarted = "滑动来开始",
        feedNameHint = "文章名称",
        editFeedName = "编辑",
        errorUnsupportedFeed = "链接不包含任何 RSS 或 Atom 订阅。",
        errorMalformedXml = "提供的链接不包含任何有效的 RSS 或 Atom 订阅",
        errorRequestTimeout = "超时。请检查你的网络后再重试",
        errorFeedNotFound = { "($it): 给定链接中未找到任何内容" },
        errorServer = {
            "($it): 服务器错误。请重试或联系网站管理员"
        },
        errorTooManyRedirects = "这个地址拥有太多跳转了，请提供一个新的地址",
        errorUnAuthorized = { "($it): 你没有被允许获取此网址上的内容" },
        errorUnknownHttpStatus = { "HTTP 连接失败，错误码: ($it)" },
        postsSearchHint = "搜索文章",
        searchSortNewest = "最新",
        searchSortNewestFirst = "最新优先",
        searchSortOldest = "最老",
        searchSortOldestFirst = "最老优先",
        searchResultsCount = { count ->
            "找到了 $count 个结果"
        },
        bookmark = "书签",
        bookmarks = "书签",
        bookmarksPlaceholder = "添加了书签的文章会出现在这里 🔖",
        settings = "设置",
        moreMenuOptions = "更多菜单选项",
        settingsHeaderBehaviour = "行为",
        settingsHeaderFeedback = "反馈和 bug 报告",
        settingsHeaderOpml = "OPML",
        settingsBrowserTypeTitle = "使用应用内浏览器",
        settingsBrowserTypeSubtitle = "当关闭时，链接会使用你的默认浏览器打开",
        settingsEnableBlurTitle = "在主页启用高斯模糊",
        settingsEnableBlurSubtitle =
        "当关闭时，将会展示渐变色，而不是高斯模糊的图片。可能会影响性能。",
        settingsShowUnreadCountTitle = "展示未读文章数",
        settingsShowUnreadCountSubtitle = "展示一个气泡当文章选中",
        settingsReportIssue = "报告一个问题",
        settingsVersion = { versionName, versionCode -> "$versionName ($versionCode)" },
        settingsAboutTitle = "关于 Twine",
        settingsAboutSubtitle = "了解一下作者吧",
        settingsOpmlImport = "导入",
        settingsOpmlExport = "导出",
        settingsOpmlImporting = { progress -> "导入中…… $progress%" },
        settingsOpmlExporting = { progress -> "导出中…… $progress%" },
        settingsOpmlCancel = "取消",
        settingsPostsDeletionPeriodTitle = "删除文章当时间超过",
        settingsPostsDeletionPeriodOneWeek = "1 周",
        settingsPostsDeletionPeriodOneMonth = "1 个月",
        settingsPostsDeletionPeriodThreeMonths = "3 个月",
        settingsPostsDeletionPeriodSixMonths = "6 个月",
        settingsPostsDeletionPeriodOneYear = "1 年",
        settingsShowReaderViewTitle = "打开阅读模式",
        settingsShowReaderViewSubtitle = "文章将会以一种简单易读的方式展示",
        feeds = "订阅",
        editFeeds = "编辑订阅",
        comments = "评论",
        about = "关于",
        aboutRoleDeveloper = "开发者",
        aboutRoleDesigner = "设计师",
        aboutSocialTwitter = "Twitter",
        aboutSocialThreads = "Threads",
        aboutSocialGitHub = "GitHub",
        aboutSocialWebsite = "主页",
        feedsSearchHint = "搜索订阅",
        allFeeds = "所有订阅",
        pinnedFeeds = "置顶",
        openWebsite = "打开网站",
        markAllAsRead = "标记全部为已读",
        noNewPosts = "没有新的内容了",
        noNewPostsSubtitle = "请稍后检查，或者下拉获取最新内容",
        postsAll = "全部",
        postsUnread = "未读",
        postsToday = "今天",
        openSource = "支持开源",
        openSourceDesc =
        "Twine is an open source project and is available for free to use. Click here to know more on how to support this project or, view source code of Twine or some of my other popular projects.",
        markAsRead = "标记为已读",
        markAsUnRead = "标记为未读",
        removeFeed = "删除订阅",
        delete = "删除",
        removeFeedDesc = { "你确定要移除 \"${it}\" 吗？" },
        alwaysFetchSourceArticle = "在阅读模式中默认获取全文",
        getFeedInfo = "获取信息",
        newTag = "新的标签",
        tags = "标签",
        addTagTitle = "添加标签",
        tagNameHint = "名称",
        tagSaveButton = "保存",
        deleteTagTitle = "删除标签？",
        deleteTagDesc =
        "Tag will be deleted and removed from all the assigned feeds. Your feeds won't be deleted",
        feedOptionShare = "分享",
        feedOptionWebsite = "网站",
        feedOptionRemove = "删除",
        feedTitleHint = "名称",
        noUnreadPostsInFeed = "没有未读的文章了",
        numberOfUnreadPostsInFeed = { numberOfUnreadPosts -> "$numberOfUnreadPosts 篇未读文章" }
    )