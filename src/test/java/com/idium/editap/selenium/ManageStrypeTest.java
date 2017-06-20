package com.idium.editap.selenium;


import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.junit.Test;

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
        //validatePresent(HomePage.LOC_BTN_THUMBMENU);

        //click(HomePage.LOC_BTN_THUMBMENU);

        validatePresent(AdminInterfaceElements.LOC_BTN_OPENMANAGESTRYPE);

        click(AdminInterfaceElements.LOC_BTN_OPENMANAGESTRYPE);

    }

    @Test
    public void cutFirstStrypeTest() {
        //validatePresent(HomePage.LOC_BTN_THUMBMENU);

        //click(HomePage.LOC_BTN_THUMBMENU);

        validatePresent(AdminInterfaceElements.LOC_BTN_OPENMANAGESTRYPE);
        click(AdminInterfaceElements.LOC_BTN_OPENMANAGESTRYPE);

        validatePresent(AdminInterfaceElements.LOC_BTN_CUTSTRYPE);
        click(AdminInterfaceElements.LOC_BTN_CUTSTRYPE);

    }
}
