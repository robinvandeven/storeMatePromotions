$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/createPromotion.feature");
formatter.feature({
  "name": "Create new promotion",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "name": "Login to storeMate MO as administrator",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "I enter the username and password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "administrator",
        ""
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "login.i_enter_the_username_and_password(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "login.i_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to Promotion Maintenance",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "I am on the home menu",
  "keyword": "Given "
});
formatter.match({
  "location": "navigateToPromotionMaintenance.i_am_on_the_home_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to navigate to Promotion Maintenance",
  "keyword": "Then "
});
formatter.match({
  "location": "navigateToPromotionMaintenance.i_want_to_navigate_to_Promotion_Maintenance()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create new promotion",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the Promotion Maintenance page",
  "keyword": "Given "
});
formatter.step({
  "name": "I want to create a new promotion with name \u003cname\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "with type \u003ctype\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "type"
      ]
    },
    {
      "cells": [
        "test01",
        "Item"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create new promotion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "I am on the Promotion Maintenance page",
  "keyword": "Given "
});
formatter.match({
  "location": "createPromotion.i_am_on_the_Promotion_Maintenance_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to create a new promotion with name test01",
  "keyword": "Then "
});
formatter.match({
  "location": "createPromotion.i_want_to_create_a_new_promotion_with_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "with type Item",
  "keyword": "And "
});
formatter.match({
  "location": "createPromotion.with_type(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: c0e3c is not a top level window handle (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LBNL10491\u0027, ip: \u0027169.254.97.42\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: io.appium.java_client.windows.WindowsDriver\nCapabilities {app: C:\\storeMate\\Framework\\BinU..., javascriptEnabled: true, platform: WINDOWS, platformName: WINDOWS}\nSession ID: C76C404B-2685-4B04-922F-8A3F9F35A107\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.windows.WindowsDriver.execute(WindowsDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.window(RemoteWebDriver.java:903)\r\n\tat bindings.createPromotion.with_type(createPromotion.java:70)\r\n\tat ✽.with type Item(file:src/test/resources/createPromotion.feature:20)\r\n",
  "status": "failed"
});
});