package io.ComputerDatabase;
import driver.WebDriverSettings;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.RegPage;
import pages.Search;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FirstTest extends WebDriverSettings {

    @Test
    public void test1() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.addButton();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        RegPage regPage = PageFactory.initElements(driver, RegPage.class);
        regPage.regName();
        regPage.introducedData();
        regPage.discontinuedData();
        regPage.nameCompany();
        regPage.CreateComp();
         }


       @Test
        public void test2() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        Search search = PageFactory.initElements(driver, Search.class);
        search.searchComp();
        search.searchsubmitBtn();

        Assert.assertNotEquals("Check it ",driver.findElement(By.xpath("//section//h1")).getText(),"No computer");

        }
}



