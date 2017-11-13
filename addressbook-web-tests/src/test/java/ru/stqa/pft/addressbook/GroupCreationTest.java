package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("TestGroup", "Header of test Group", "Footer of test Group"));
        submitGroupCreation();
        returnToCreationPage();
    }

}
