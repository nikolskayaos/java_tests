package ru.stqa.pft.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.models.ContactData;

public class ContactHelper extends HelperBase {
    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }


    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"),contactData.getWorkPhone());
        type(By.name("fax"),contactData.getFax());
        type(By.name("email"),contactData.getEmail());
        type(By.name("email2"),contactData.getEmail2());
        type(By.name("email3"),contactData.getEmail3());
        type(By.name("homepage"),contactData.getHomepage());

        click(By.xpath("//div[@id='content']/form/select[1]//option[5]"));
        click(By.xpath("//div[@id='content']/form/select[2]//option[2]"));
        type(By.name("byear"), contactData.getByear());

        click(By.xpath("//div[@id='content']/form/select[3]//option[4]"));
        click(By.xpath("//div[@id='content']/form/select[4]//option[4]"));
        type(By.name("ayear"), contactData.getAyear());

        click(By.xpath("//div[@id='content']/form/select[5]//option[2]"));

        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getHomePhone2());
        type(By.name("notes"), contactData.getNote());

    }



}
