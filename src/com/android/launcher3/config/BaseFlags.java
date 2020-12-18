/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.launcher3.config;

/**
 * Defines a set of flags used to control various launcher behaviors.
 * <p>
 * All the flags should be defined here with appropriate default values. To override a value,
 * redefine it in {@link FeatureFlags}.
 * <p>
 * This class is kept package-private to prevent direct access.
 */
abstract class BaseFlags {

    BaseFlags() {
    }

    public static final boolean IS_DOGFOOD_BUILD = false;
    // BaseFlags中的AUTHORITY必须和AndroidManifest.xml文件中的LauncherProvide配置的authorities一样
    public static final String AUTHORITY = "com.android.mxlauncher3.settings".intern();

    // When enabled allows to use any point on the fast scrollbar to start dragging.
    public static final boolean LAUNCHER3_DIRECT_SCROLL = true;
    // When enabled the promise icon is visible in all apps while installation an app.
    public static final boolean LAUNCHER3_PROMISE_APPS_IN_ALL_APPS = false;
    // When enabled allows use of spring motions on the icons.
    public static final boolean LAUNCHER3_SPRING_ICONS = true;

    // Feature flag to enable moving the QSB on the 0th screen of the workspace.
    public static final boolean QSB_ON_FIRST_SCREEN = true;

    // When true, custom widgets are loaded using CustomWidgetParser.
    public static final boolean ENABLE_CUSTOM_WIDGETS = false;

    // Features to control Launcher3Go behavior
    public static final boolean GO_DISABLE_WIDGETS = false;

    // When true, overview shows screenshots in the orientation they were taken rather than
    // trying to make them fit the orientation the device is in.
    public static final boolean OVERVIEW_USE_SCREENSHOT_ORIENTATION = true;

    // 是否禁用双指捏掐到预览模式
    public static final boolean LAUNCHER3_DISABLE_PINCH_TO_OVERVIEW = true;

    // 是否循环滑动
    public static final boolean LAUNCHER3_CIRCLE_SCROLL = false;

    // 是否开启负一屏，当LAUNCHER_OVERLAY_ENABLED = false才起作用
    public static final boolean CUSTOM_CONTENT_ENABLED = false;

    // 是否开启跨进程的负一屏，如果开启，则不会开启CustomContent负一屏
    public static final boolean LAUNCHER_OVERLAY_ENABLED = false;

    // add by codemx.cn ---- 20200710 ---- start
    // 绑定完成后是否滑动到最后一页
    public static final boolean SCROLL_TO_LAST_PAGE_WHEN_BIND_FINISH = false;
    // add by codemx.cn ---- 20200710 ---- start

}
