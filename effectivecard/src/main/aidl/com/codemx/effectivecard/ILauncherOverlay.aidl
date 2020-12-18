
package com.codemx.effectivecard;



import com.codemx.effectivecard.MxMessage;
import com.codemx.effectivecard.MxLayoutParams;
import com.codemx.effectivecard.ILauncherOverlayCallback;

interface ILauncherOverlay {

    void startScroll();
    
    void onScroll(float progress, boolean isRtl);
    
    void endScroll();


    void windowAttached(in MxLayoutParams layoutParams, ILauncherOverlayCallback overlayCallback, int flags);
    
    void windowDetached(boolean isChangingConfigurations);


    void openOverlay(int flags);


    void closeOverlay(int flags);
    
    void onResume();

    void onPause();


    void onTransact(in MxMessage msg);

    void requestVoiceDetection(boolean start);
    
    String getVoiceSearchLanguage();
    
    boolean isVoiceDetectionRunning();
    
    void enableScroll(boolean left, boolean right);
    
    void enableTransparentWallpaper(boolean isTransparent);
    
    void enableLoopWithOverlay(boolean enableLoop);
}
