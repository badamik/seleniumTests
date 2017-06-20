package com.idium.editap.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;


@Config(
        browser = Browser.CHROME,
        url = "http://dev-strype.idium.no/travelsome.login"
)

/**
 * Created by Bartek on 23.05.2017.
 */
public class LoginTest extends Locomotive {
/*
    @Test
    public void testLoginFormExist() {
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        validatePresent(AdminInterfaceElements.LOC_INP_LOGIN);
        validatePresent(AdminInterfaceElements.LOC_INP_PASSWORD);
    }

    @Test
    public void testLoginForm() throws InterruptedException {
        setText(AdminInterfaceElements.LOC_INP_LOGIN, "admin@travelsome.com");
        setText(AdminInterfaceElements.LOC_INP_PASSWORD, "admin");
        click(AdminInterfaceElements.LOC_BTN_SUBMIT);


        WebDriverWait wait = new WebDriverWait(driver, 1000);
        validatePresent(AdminInterfaceElements.LOC_BTN_THUMBMENU);

        //wait.until();

        //WebDriverWait wait = new WebDriverWait(driver, 10000);
        //wait.withMessage("dupaaa");
        //wait.wait(10000);
    }
*/
}
