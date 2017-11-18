package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.ContactData;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification(){
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("test2", "test22", "test32", "test4", "title", "company", "address", "+796545564", "+795645123", "+795645123", "+795645123", "test@test.ru", "test@test.ru", "test@test.ru", "test@test.ru", "1995", "1995", "address 2", "123456", "notes"));
        app.getContactHelper().submitContactModification();
    }
}
