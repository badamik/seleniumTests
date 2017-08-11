package com.idium.editap.selenium;

import org.openqa.selenium.By;


/**
 * Created by Bartek on 23.05.2017.
 */
public class AdminInterfaceElements {

    //login form
    public static final String LOC_INP_LOGIN = "input[name='username']";
    public static final String LOC_INP_PASSWORD = "input[name='password']";
    public static final String LOC_BTN_SUBMIT = "button[type='submit']";


    // thumb menu
    public static final String LOC_BTN_THUMBMENU = "//label[contains(@class, 'ggc-label')]";
    public static final By LOC_BTN_THUMBMENU_SOLUTIONSETTINGS = By.xpath("//i[contains(@class, 'bi_interface-list-view')]");

    //solution settings
    public static final String LOC_DIV_SOLUTIONSETTINGS = "//div[contains(@class, 'solutionSettings')]";
    public static final String LOC_BTN_PAGESETTINGS = "//i[contains(@class, 'pageSettings')]";
    public static final String LOC_DIV_PAGESETTINGS = "//div[contains(@class, 'settingsSection')]";


    //manage strype
    public static final By LOC_BTN_OPENMANAGESTRYPE = By.xpath("//div[contains(@class, 'strypeDynagoo')]/label[contains(@class,'gg-label')]");
    public static final By LOC_BTN_CUTSTRYPE = By.xpath("//div[contains(@class, 'strypeDynagoo')]//a[contains(@title,'Cut')]");
    public static final By LOC_BTN_ADDSTRYPE = By.xpath("//div[contains(@class, 'addStrype')]//a[contains(@class,'ciBut-plus')]");

    //strype library
    public static final String LOC_DIV_STRYPELIBRARY = "div[class='library-container strype-library']";

    //Dynagoo menu
    public static final String LOC_DIV_WIDGETCLICKOVERLAY = "div[class='widget-click-overlay']";
    public static final By LOC_BTN_ADDWIDGET = By.xpath("//div[contains(@class, 'widgetMenu')]//a[contains(@title,'Add')]");
    public static final By LOC_BTN_ADDWIDGETBELOW = By.xpath("//div[contains(@class, 'widgetMenu')]//a[contains(@title,'Below')]");
    public static final String LOC_DIV_WIDGETLIBRARY = "div[class='library-container widget-library']";






}
