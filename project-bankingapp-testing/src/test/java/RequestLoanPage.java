import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RequestLoanPage {
    WebDriver driver;


    @BeforeMethod
    public void requestLoanBeforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Thread.sleep(500);
    }

    @Test
    public void requestLoanTest(){

        WebElement userName = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
        userName.sendKeys("john");

        WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
        password.sendKeys("demo");

        WebElement loginButton = driver.findElement(By.xpath("(//input[@value='Log In'])[1]"));
        loginButton.click();

        driver.get("https://parabank.parasoft.com/parabank/requestloan.htm");

        WebElement lAmount = driver.findElement(By.xpath("//input[@id='amount']"));
        lAmount.sendKeys("2000");

        WebElement dPayment = driver.findElement(By.xpath("//input[@id='downPayment']"));
        dPayment.sendKeys("500");

        WebElement accDropdown = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
        accDropdown.click();
        Select selectElement =new Select(accDropdown);

        List<WebElement> options = selectElement.getOptions();
        System.out.println(options.size());

        for (WebElement e:options){
            System.out.println("The Values are " + e.getText());
        }

        if (selectElement.isMultiple()) {
        List<WebElement> options1 = selectElement.getOptions();
        
        
        for (int i = 0; i < options1.size(); i++) {
            selectElement.selectByIndex(i);
        }
        System.out.println("All options selected successfully!");
        } else {
        System.out.println("This dropdown doesn't support multiple selections!");
        }

        WebElement applyButton = driver.findElement(By.xpath("//input[@value='Apply Now']"));
        applyButton.click();
    }
}
