package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage {

    private WebDriver driver;

    public RegPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id="name")
    private WebElement nameComp;

    public void regName() {
        nameComp.sendKeys("Comp322");
    }
    @FindBy(id="introduced")
    private  WebElement inData;

    public void introducedData() {
        inData.sendKeys("2011-05-12");
        }

    @FindBy(id="discontinued")
    private  WebElement quitData;

    public void discontinuedData() {
        quitData.sendKeys("2021-05-12");
    }

    @FindBy(xpath="//option[@value='3']")
    private  WebElement company;

    public void nameCompany() {
        company.click();
    }
    @FindBy(xpath="//input[@class='btn primary']")
    private  WebElement createComp;

    public void CreateComp() {
        createComp.click();
    }
}

