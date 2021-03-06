package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.ContactData;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoContactPage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().createContact(new ContactData("test", "test2", "test3", "test4", "title",
                "company", "address", "+796545564", "+795645123", "+795645123",
                "+795645123", "test@test.ru", "test@test.ru", "test@test.ru", "test@test.ru",
                "1995", "1995", "address 2", "123456", "notes", "TestGroup"));
        int after = app.getContactHelper().getContactCount();

        Assert.assertEquals(after, before + 1);
    }
}
