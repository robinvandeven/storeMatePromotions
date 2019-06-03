package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class navigateToPromotionMaintenance {
    WindowsDriver<RemoteWebElement> driver = login.initializeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 120);

    public navigateToPromotionMaintenance() throws MalformedURLException {
    }


    @Given("I am on the home menu")
    public void i_am_on_the_home_menu() throws Throwable{

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("02 - Promotion")));

        Assert.assertTrue(driver.findElementByName("02 - Promotion").isDisplayed());
    }

    @Then("I want to navigate to Promotion Maintenance")
    public void i_want_to_navigate_to_Promotion_Maintenance() {

        driver.findElementByName("02 - Promotion").click();

        driver.findElementByName("02 - Promotion maintenance").click();

        Assert.assertTrue(driver.findElementByName("Promotion maintenance").isDisplayed());

    }
}
