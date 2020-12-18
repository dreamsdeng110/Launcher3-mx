
package com.android.mxtheme;

import com.android.mxtheme.IRemoteCallback;
import com.android.mxtheme.bean.ThemeBean;
import com.android.mxtheme.bean.WallpaperBean;

interface IThemeService {


    void register(IRemoteCallback callback);


    void unRegister(IRemoteCallback callback);


    boolean setTheme(in ThemeBean themeBean);

    boolean setWallpaper(in WallpaperBean wallpaperBean);

}
