package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;

public class createPromotion {
    WindowsDriver<RemoteWebElement> driver = login.initializeDriver();

    public createPromotion() throws MalformedURLException {
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


        String handle = driver.getWindowHandle();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appTopLevelWindow", handle);

        Assert.assertTrue(driver.findElementByName("Select promotion type").isDisplayed());


//        RemoteWebElement popupWindow =driver.findElementById("PromotionTypeSelectionForm");
//        String popupWindowHandle = popupWindow.getAttribute("NativeWindowHandle");
//        int popupWindowHandleInt = Integer.parseInt(popupWindowHandle);
//        String popupWindowHandleHex = Integer.toHexString(popupWindowHandleInt);
//
//        DesiredCapabilities appCapabilities = new DesiredCapabilities();
//        appCapabilities.setCapability("appTopLevelWindow",popupWindowHandleHex);



//      Click on the type of promotion type in the list of different types
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Pane[@Name=\"Promotion\"][@AutomationId=\"PromotionPartsForm\"]/Window[@Name=\"Select promotion type\"][@AutomationId=\"PromotionTypeSelectionForm\"]/List[@AutomationId=\"promoTypeList\"]/ListItem[@Name=\"" + arg1 + "\"]").click();



//      Click on "OK" button
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Pane[@Name=\"Promotion\"][@AutomationId=\"PromotionPartsForm\"]/Window[@Name=\"Select promotion type\"][@AutomationId=\"PromotionTypeSelectionForm\"]/Pane[@Name=\"OK\"][@AutomationId=\"okButton\"]").click();
    }
}
