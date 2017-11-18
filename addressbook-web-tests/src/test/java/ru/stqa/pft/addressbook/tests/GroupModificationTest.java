package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.GroupData;

public class GroupModificationTest extends TestBase {
    @Test
    public void testModificationGroup(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("TestGroup2", "Header of test Group2", "Footer of test Group2"));
        app.getGroupHelper().submitGroupModification();
        app.returnToCreationPage();
    }
}
