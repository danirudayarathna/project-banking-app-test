import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TransferFunds {
    WebDriver driver;


    @BeforeMethod
    public void transferFundBeforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void transferFundTest(){
        WebElement userName = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
        userName.sendKeys("john");

        WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
        password.sendKeys("demo");

        WebElement loginButton = driver.findElement(By.xpath("(//input[@value='Log In'])[1]"));
        loginButton.click();

        driver.get("https://parabank.parasoft.com/parabank/transfer.htm");

        WebElement transferAmount = driver.findElement(By.id("amount"));
        transferAmount.clear();
        transferAmount.sendKeys("5000");

        WebElement dropdown1 = driver.findElement(By.id("fromAccountId"));
        dropdown1.click();

        Select selectElement = new Select(dropdown1);

        List<WebElement> options1 = selectElement.getOptions();
        System.out.println(options1.size());

//        for (WebElement e:options1){
//            System.out.println("Dropdown options are " + );
//        }
//
//        selectElement.selectByValue("12900");

    }
}
