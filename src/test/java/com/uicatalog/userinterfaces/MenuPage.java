package com.uicatalog.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

    private MenuPage(){
        throw new IllegalStateException("not instantiable class");
    }

    public static Target BTN_ALERT_VIEW = Target.the("").locatedForAndroid(AppiumBy.accessibilityId("1")).locatedForIOS(AppiumBy.accessibilityId("Alert Views"));

}
