package com.uicatalog.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class AlertPage {

    private AlertPage(){
        throw new IllegalStateException("not instantiable class");
    }

    public static Target BTN_SIMPLE_ALERT= Target.the("").locatedForAndroid(AppiumBy.accessibilityId("1")).locatedForIOS(AppiumBy.accessibilityId("Simple"));
    public static Target LBL_SIMPLE_ALERT= Target.the("").locatedForAndroid(AppiumBy.accessibilityId("1")).locatedForIOS(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'A Short Title Is Best'`]"));
    public static Target BTN_OK_SIMPLE_ALERT= Target.the("").locatedForAndroid(AppiumBy.accessibilityId("1")).locatedForIOS(AppiumBy.accessibilityId("OK"));

}
