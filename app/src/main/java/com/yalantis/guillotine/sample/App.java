package com.yalantis.guillotine.sample;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by Dmytro Denysenko on 5/6/15.
 This is my changes!
 */
public class App extends Application {
    private static final String CANARO_EXTRA_BOLD_PATH = "fonts/canaro_extra_bold.otf";
    public static Typeface canaroExtraBold;

    @Override
    public void onCreate() {
        super.onCreate();
        typeCreate();
    }

    private void typeCreate() {
        canaroExtraBold = Typeface.createFromAsset(getAssets(), CANARO_EXTRA_BOLD_PATH);

    }
}
