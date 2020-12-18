
package com.android.mxtheme;

import com.android.mxtheme.bean.ThemeBean;
import com.android.mxtheme.bean.WallpaperBean;

interface IRemoteCallback {


    void onThemeSuccess(in ThemeBean bean);


    void onThemeFail(in String errMsg, in ThemeBean bean);


    void onWallpaperSuccess(in WallpaperBean bean);


    void onWallpaperFail(in String errMsg, in WallpaperBean bean);

}
