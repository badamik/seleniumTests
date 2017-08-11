package com.idium.editap.selenium;

import org.apache.commons.io.FileUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Bartosz Adamik on 09.08.2017.
 */
public class takeScreenshotRule extends TestWatcher{
    private WebDriver driver;

    String pathForScreenshots = "failScreenshots/";


    public takeScreenshotRule(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    protected void failed(Throwable e, Description description) {

        String fileName = new Date().getTime() + " - " + description.getMethodName();

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(pathForScreenshots + fileName + ".png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
