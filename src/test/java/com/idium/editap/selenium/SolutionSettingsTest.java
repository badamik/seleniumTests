package com.idium.editap.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


@Config(
        browser = Browser.CHROME,
        url = "http://dev-strype.idium.no/travelsome"
)

/**
 * Created by Bartek on 23.05.2017.
 */
public class SolutionSettingsTest extends Login {

    @Test
    public void openSolutionSettingsTest() {

        WebElement buttonThumbmenu = driver.findElement(By.xpath(AdminInterfaceElements.LOC_BTN_THUMBMENU));
        buttonThumbmenu.click();

        WebElement buttonSolutionSettings = driver.findElement(By.xpath(AdminInterfaceElements.LOC_BTN_THUMBMENU_SOLUTIONSETTINGS));
        buttonSolutionSettings.click();


        WebElement divSolutionSettings = (new WebDriverWait(driver, 100))
               .until(ExpectedConditions.presenceOfElementLocated(By.xpath(AdminInterfaceElements.LOC_DIV_SOLUTIONSETTINGS)));

        Assert.assertNotNull(divSolutionSettings);
    }

    @Test
    public void openpageSettingsTest() throws IOException {
        WebElement buttonThumbmenu = driver.findElement(By.xpath(AdminInterfaceElements.LOC_BTN_THUMBMENU));
        buttonThumbmenu.click();

        WebElement buttonSolutionSettings = driver.findElement(By.xpath(AdminInterfaceElements.LOC_BTN_THUMBMENU_SOLUTIONSETTINGS));
        buttonSolutionSettings.click();


        WebElement divSolutionSettings = (new WebDriverWait(driver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(AdminInterfaceElements.LOC_DIV_SOLUTIONSETTINGS)));

        //File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("iamnotadumbass.png"));

        WebElement pageSettings = driver.findElement(By.xpath(AdminInterfaceElements.LOC_BTN_PAGESETTINGS));
        pageSettings.click();



    }

}
