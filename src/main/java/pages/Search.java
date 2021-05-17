package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 public class Search {

   private WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
    }
        @FindBy(id = "searchbox")
        private WebElement searchВox;

        public void searchComp() {
            searchВox.sendKeys("Comp322");
        }
         @FindBy(id = "searchsubmit")
        private WebElement searchsubmit;

        public void searchsubmitBtn() {
            searchsubmit.click();
     }

    }

 /*driver.findElement(By.id("searchbox")).sendKeys("Comp322");
         driver.findElement(By.id("searchsubmit")).click();
         Assert.assertNotEquals("Check it ",driver.findElement(By.xpath("//section//h1")).getText(),"No computer");
// Assert.assertEquals(driver.findElement(By.linkText("No computer")),"No computer");
*/