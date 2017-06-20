package com.idium.editap.selenium;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

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

    @Before
    public void testLoginForm() throws InterruptedException {

        System.out.println("test login form");

        File file = new File("phantomjs");

        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
        System.out.println("czy plik zostal wczytany ?");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.exists());

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true); // enabled by default
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                file.getAbsolutePath()
        );

        WebDriver driver = new PhantomJSDriver(caps);

        //driver.get("http://www.google.com");


        System.out.println("test login form start");

        driver.get("http://dev-strype.idium.no/travelsome.login");

        //setText(AdminInterfaceElements.LOC_INP_LOGIN, "admin@travelsome.com");
        //setText(AdminInterfaceElements.LOC_INP_PASSWORD, "admin");
        //click(AdminInterfaceElements.LOC_BTN_SUBMIT);


        //WebDriverWait wait = new WebDriverWait(driver, 1000);
        //validatePresent(AdminInterfaceElements.LOC_BTN_THUMBMENU);
        //click(AdminInterfaceElements.LOC_BTN_THUMBMENU);

        //wait.until();

        //WebDriverWait wait = new WebDriverWait(driver, 10000);
        //wait.withMessage("dupaaa");
        //wait.wait(10000);
    }
}
