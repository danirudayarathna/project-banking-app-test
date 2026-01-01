import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver;

    @BeforeMethod
    public void homePageBeforeTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }

    @Test
    public void homePageTest(){
        //Test Case 001
        WebElement homePageButton = driver.findElement(By.xpath("(//li[@class='home'])[1]"));
        homePageButton.click();

        WebElement aboutPageButton = driver.findElement(By.xpath("(//li[@class='aboutus'])[1]"));
        aboutPageButton.click();

        WebElement contactPageButton = driver.findElement(By.xpath("(//li[@class='contact'])[1]"));
        contactPageButton.click();

        WebElement readmorePageButton = driver.findElement(By.xpath("(//p[@class='more'])[2]"));
        readmorePageButton.click();
    }
}
