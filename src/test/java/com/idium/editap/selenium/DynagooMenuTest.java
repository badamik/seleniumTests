package com.idium.editap.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@Config(
        browser = Browser.CHROME,
        url = "http://dev-strype.idium.no/travelsome"
)

/**
 * Created by Bartek on 23.05.2017.
 */
public class DynagooMenuTest extends Login {

    @Test
    public void openDynagoo() {
        System.out.println("########## open dynagoo");
        WebElement widgetOverlay = driver.findElement(By.cssSelector("div[class='widget-click-overlay']"));

        Actions action = new Actions(driver).contextClick(widgetOverlay);
        action.build().perform();

        validatePresent(AdminInterfaceElements.LOC_BTN_ADDWIDGET);
        click(AdminInterfaceElements.LOC_BTN_ADDWIDGET);


        validatePresent(AdminInterfaceElements.LOC_BTN_ADDWIDGETBELOW);
        click(AdminInterfaceElements.LOC_BTN_ADDWIDGETBELOW);

        validatePresent(AdminInterfaceElements.LOC_DIV_STRYPELIBRARY);
    }
}
