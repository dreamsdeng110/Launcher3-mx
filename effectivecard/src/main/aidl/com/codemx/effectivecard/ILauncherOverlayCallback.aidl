
package com.codemx.effectivecard;



interface ILauncherOverlayCallback {

    void overlayScrollChanged(float progress);


    void overlayStatusChanged(int overlayAttached);


    void requestStatusBarState(int state);


    void requestSearchActivity();

}
