package com.idium.editap.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

@Config(
        browser = Browser.CHROME,
        url = "http://dev-strype.idium.no/travelsome.login"
)

/**
 * Created by Bartek on 24.05.2017.
 */
public class Login extends Locomotive {

    @Before
    public void testLoginForm() throws InterruptedException {
        System.out.println("test login form start");

        driver.get("http://dev-strype.idium.no/travelsome.login");

        setText(AdminInterfaceElements.LOC_INP_LOGIN, "admin@travelsome.com");
        setText(AdminInterfaceElements.LOC_INP_PASSWORD, "admin");
        click(AdminInterfaceElements.LOC_BTN_SUBMIT);


        WebDriverWait wait = new WebDriverWait(driver, 1000);
        validatePresent(AdminInterfaceElements.LOC_BTN_THUMBMENU);
        click(AdminInterfaceElements.LOC_BTN_THUMBMENU);

        //wait.until();

        //WebDriverWait wait = new WebDriverWait(driver, 10000);
        //wait.withMessage("dupaaa");
        //wait.wait(10000);
    }
}
