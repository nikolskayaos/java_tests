package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.models.ContactData;

import static org.openqa.selenium.OutputType.*;

public class ContactDeleteTest extends TestBase{

    @Test
    public void DeleteContactTest() {
        app.getNavigationHelper().gotoContactPage();
        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("test", "test2", "test3", "test4", "title",
                    "company", "address", "+796545564", "+795645123", "+795645123",
                    "+795645123", "test@test.ru", "test@test.ru", "test@test.ru", "test@test.ru",
                    "1995", "1995", "address 2", "123456", "notes", "TestGroup"));
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.acceptAlert();
        app.getNavigationHelper().gotoContactPage();
        int after = app.getContactHelper().getContactCount();

        Assert.assertEquals(after, before - 1);
    }
}
