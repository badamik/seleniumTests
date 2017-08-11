package com.idium.editap.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Config(
        browser = Browser.CHROME,
        url = "http://dev-strype.idium.no/travelsome"
)

/**
 * Created by Bartek on 23.05.2017.
 */
public class BaseClientSolutionScreenshotsTest extends Login {

    List<String> solutionNames = Arrays.asList("travelsome", "plantasyTemplate", "travel", "bedbreakfast", "crossfit", "craft");

    String pathForScreenshots = "solutionScreenshots/";

    @Test
    public void openDynagoo() {

/*

        System.out.println("########## open dynagoo");
        WebElement widgetOverlay = driver.findElement(By.cssSelector("div[class='widget-click-overlay']"));

        Actions action = new Actions(driver).contextClick(widgetOverlay);
        action.build().perform();

        validatePresent(AdminInterfaceElements.LOC_BTN_ADDWIDGET);
        click(AdminInterfaceElements.LOC_BTN_ADDWIDGET);


        validatePresent(AdminInterfaceElements.LOC_BTN_ADDWIDGETBELOW);
        click(AdminInterfaceElements.LOC_BTN_ADDWIDGETBELOW);

        validatePresent(AdminInterfaceElements.LOC_DIV_STRYPELIBRARY);

        */
    }

    @Test
    public void openSolution() {


        Iterator<String> it = solutionNames.iterator();

        while(it.hasNext()) {
            String solutionName = it.next();

            driver.get(testServerUrl + solutionName);

            takeScreenshot(solutionName);
        }
    }

    public void takeScreenshot(String solutionName) {
        String fileName = solutionName;

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(pathForScreenshots + fileName + ".png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
