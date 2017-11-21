package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.GroupData;

public class GroupDeleteTest extends TestBase {

    @Test
    public void testDeleteGroup() {
        app.getNavigationHelper().gotoGroupPage();
        if(!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("TestGroup", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.returnToCreationPage();
    }

}
