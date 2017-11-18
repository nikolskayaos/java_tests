package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.models.ContactData;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("test", "test2", "test3", "test4", "title", "company", "address", "+796545564", "+795645123", "+795645123", "+795645123", "test@test.ru", "test@test.ru", "test@test.ru", "test@test.ru", "1995", "1995", "address 2", "123456", "notes"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoContactPage();
    }
}
