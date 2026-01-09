import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RequestLoanPage {
    WebDriver driver;


    @BeforeMethod
    public void requestLoanBeforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
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
    }
}
