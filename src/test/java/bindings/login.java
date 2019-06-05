package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class login {


    public static WindowsDriver<RemoteWebElement> driver;

    public static WindowsDriver<RemoteWebElement> initializeDriver() throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\storeMate\\Framework\\BinUI\\FrameworkUI.exe");
        capabilities.setCapability("platformName ", "Windows");
        capabilities.setCapability("deviceName  ", "WindowsPC");
                driver = new WindowsDriver(new URL("http://localhost:4723"), capabilities);
        return driver;
    }

    @Given("I enter the username and password")
    public void i_enter_the_username_and_password(List<List<String>> arg1) throws Throwable {
        startWinAppDriver();
        initializeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Window[@AutomationId=\"LogonForm\"]/Pane[starts-with(@AutomationId,\"panel\")]/Pane[@Name=\"Log on.\"][@AutomationId=\"logonPrompt\"]")));

//      Clear the "User Id" field and send the input from datatable
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Window[@AutomationId=\"LogonForm\"]/Pane[starts-with(@AutomationId,\"panel\")]/Edit[@AutomationId=\"UserIdTB\"]").clear();
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Window[@AutomationId=\"LogonForm\"]/Pane[starts-with(@AutomationId,\"panel\")]/Edit[@AutomationId=\"UserIdTB\"]").sendKeys(arg1.get(1).get(0));

//       Enter password
//       driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Window[@AutomationId=\"LogonForm\"]/Pane[starts-with(@AutomationId,\"panel\")]/Edit[@AutomationId=\"PasswordTB\"]").sendKeys("");

//      Click "OK" button
        driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Window[@AutomationId=\"LogonForm\"]/Pane[starts-with(@AutomationId,\"panel\")]/Pane[@Name=\"OK\"][starts-with(@AutomationId,\"button\")]").click();
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() throws Throwable {
        Assert.assertTrue(driver.findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@Name=\"storeMate\"][@AutomationId=\"UIFrameworkForm\"]/Pane[@AutomationId=\"taskPane\"]/Pane[@AutomationId=\"workSpace\"]/Pane[@AutomationId=\"MenuForm\"]").isDisplayed());
//

    }

    public static void startWinAppDriver() {
        try {
            Runtime.getRuntime().exec("cmd.exe /c cd \"C:\\Program Files (x86)\\Windows Application Driver\" & start WinAppDriver.exe");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }





}





