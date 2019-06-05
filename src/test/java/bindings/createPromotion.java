package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.IOException;
import java.util.List;

public class createPromotion {
    WindowsDriver<RemoteWebElement> driver = login.initializeDriver();

    public createPromotion() throws IOException {
    }




    @Given("^I am on the Promotion Maintenance page$")
    public void i_am_on_the_Promotion_Maintenance_page() {
        Assert.assertTrue(driver.findElementByName("Promotion maintenance").isDisplayed());

    }

    @Then("^I want to create a new promotion with name ([^\"]*)$")
    public void i_want_to_create_a_new_promotion_with_name(String arg1) throws InterruptedException {
        driver.findElementByAccessibilityId("newButton").click();

//      Enter promotion name
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Pane[@Name=\"Promotion\"][@AutomationId=\"PromotionPartsForm\"]/Pane[@Name=\"Active until (time)\"][starts-with(@AutomationId,\"topPanel\")]/Pane[@Name=\"Promotion name\"][@AutomationId=\"promoNameLanguageControl\"]/Edit[@AutomationId=\"inputBox\"]").sendKeys(arg1);

//      Enter promotion reference
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Pane[@Name=\"Promotion\"][@AutomationId=\"PromotionPartsForm\"]/Pane[@Name=\"Active until (time)\"][starts-with(@AutomationId,\"topPanel\")]/Pane[@Name=\"Reference\"][@AutomationId=\"referenceInputControl\"]/Edit[@AutomationId=\"inputBox\"]").sendKeys(arg1);

//      Click "Save" button
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Pane[@Name=\"Promotion\"][@AutomationId=\"PromotionPartsForm\"]/Pane[starts-with(@ClassName,\"WindowsForms10\")]/Pane[@AutomationId=\"saveButton\"]").click();

//      Click "new" button, in order to add a new promotion to the newly created promotion group
        driver.findElementByName("New").click();
    }


    @Then("^with type ([^\"]*)$")
    public void with_type(String arg1) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<RemoteWebElement> windows = driver.findElementsByTagName("Window");

        int i=0;

        System.out.println("number of windows: " + windows.size());
        for (RemoteWebElement window:windows){
            System.out.println("Name window " + i + " " +  window.getAttribute("Name"));
            System.out.println("Handle window " + i + " " + window.getAttribute("NativeWindowHandle"));
        }

        int intValueHandle = Integer.parseInt(windows.get(1).getAttribute("NativeWindowHandle"));
        String hexValueHandle = Integer.toHexString(intValueHandle);
        System.out.println("hexValueHandle" + hexValueHandle);

        driver.switchTo().window(hexValueHandle);



//        System.out.println("Initial windowHandle: " + driver.getWindowHandle());
//
//        Set<String> windowHandles = driver.getWindowHandles();
//
//
//        for (String handle:windowHandles){
//            System.out.println(handle);
//        }
//
//        driver.switchTo().activeElement();
//        System.out.println("Final windowHandle: " + driver.getWindowHandle());
//
//        List<RemoteWebElement> popupWindow = driver.findElementsByClassName("WindowsForms10.Window.8.app.0.3933f29_r28_ad3");
//
//        for(RemoteWebElement element: popupWindow){
//            System.out.println(element.getAttribute("Name"));
//        }
//        System.out.println(popupWindow);
//        String popupWindowHandle = popupWindow.getAttribute("NativeWindowHandle");
//        int popupWindowHandleInt = Integer.parseInt(popupWindowHandle);
//        String popupWindowHandleHex = Integer.toHexString(popupWindowHandleInt);
//        System.out.println("Attribute: " + popupWindowHandle + ", int:" + popupWindowHandleInt + "String: " + popupWindowHandleHex);
//
//        DesiredCapabilities appCapabilities = new DesiredCapabilities();
//        appCapabilities.setCapability("appTopLevelWindow",popupWindowHandle);



//      Click on the type of promotion type in the list of different types
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Pane[@Name=\"Promotion\"][@AutomationId=\"PromotionPartsForm\"]/Window[@Name=\"Select promotion type\"][@AutomationId=\"PromotionTypeSelectionForm\"]/List[@AutomationId=\"promoTypeList\"]/ListItem[@Name=\"" + arg1 + "\"]").click();



//      Click on "OK" button
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Pane[@Name=\"Promotion\"][@AutomationId=\"PromotionPartsForm\"]/Window[@Name=\"Select promotion type\"][@AutomationId=\"PromotionTypeSelectionForm\"]/Pane[@Name=\"OK\"][@AutomationId=\"okButton\"]").click();
    }
}
