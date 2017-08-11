package com.idium.editap.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/*
@Config(
        browser = Browser.CHROME,
        url = "http://dev-strype.idium.no/travelsome.login"
)
*/

/**
 * Created by Bartek on 24.05.2017.
 */
public class Login {

    WebDriver driver;

    String testServerUrl = "http://dev-strype.idium.no/";

    @Before
    public void testLoginForm() throws InterruptedException {
        driver = new PhantomJSDriver();
        System.out.println("test login form");

        File file = new File("phantomjs");

        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
        System.out.println("czy plik zostal wczytany ?");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.exists());

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true); // enabled by default
        caps.setCapability("takesScreenshot", true);
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                file.getAbsolutePath()
        );

        driver.get(testServerUrl +  "travelsome.login");

        System.out.println("page title -> " +driver.getTitle());

        WebElement loginInput = driver.findElement(By.name("username"));

        loginInput.sendKeys("adamik");

        WebElement passwordInput = driver.findElement(By.name("password"));

        passwordInput.sendKeys("admin");

        WebElement submitButton = driver.findElement(By.className("bi_user-key"));

        submitButton.click();

        WebElement myDynamicElement = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("strype-thumb-menu")));

        System.out.println("Title of the page after login is -> " + driver.getTitle());

    }

    @After
    public void closeWebDriver () {
        driver.quit();
    }

    @Rule
    public takeScreenshotRule takeScreenshotRule = new takeScreenshotRule(driver);

}
