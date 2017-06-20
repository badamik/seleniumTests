package com.idium.editap.selenium;


import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;

@Config(
        browser = Browser.CHROME,
        url = "http://dev-strype.idium.no/travelsome"
)

/**
 * Created by Bartek on 23.05.2017.
 */
public class StrypeLibraryTest extends Login {
/*
    @Test
    public void openStrypeLibraryTest() {


        validatePresent(AdminInterfaceElements.LOC_BTN_ADDSTRYPE);
        click(AdminInterfaceElements.LOC_BTN_ADDSTRYPE);
        validatePresent(AdminInterfaceElements.LOC_DIV_STRYPELIBRARY);
    }

    @Test
    public void addStrypeTest() {

    }
*/
}
