package com.idium.editap.selenium;


import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Config(
        browser = Browser.CHROME,
        url = "http://dev-strype.idium.no/travelsome"
)

/**
 * Created by Bartek on 23.05.2017.
 */
public class ManageStrypeTest extends Login {

    @Test
    public void openManageStrypeTest() {

        WebElement buttonThumbmenu = driver.findElement(By.xpath(AdminInterfaceElements.LOC_BTN_THUMBMENU));
        buttonThumbmenu.click();

        WebElement strypeSettings = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(AdminInterfaceElements.LOC_BTN_THUMBMENU_SOLUTIONSETTINGS));


        WebElement buttonManageStrype = driver.findElement(AdminInterfaceElements.LOC_BTN_OPENMANAGESTRYPE);

        buttonManageStrype.click();

    }

    @Test
    public void cutFirstStrypeTest() {

        WebElement buttonThumbmenu = driver.findElement(By.xpath(AdminInterfaceElements.LOC_BTN_THUMBMENU));
        buttonThumbmenu.click();

        WebElement strypeSettings = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(AdminInterfaceElements.LOC_BTN_OPENMANAGESTRYPE));

        WebElement cutStrype = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(AdminInterfaceElements.LOC_BTN_CUTSTRYPE));

        cutStrype.click();


    }

}
