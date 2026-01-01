import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPage {
        WebDriver driver;

        @BeforeMethod
        public void loginPageBeforeTest() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/parabank/index.htm");
        }

        @Test
        public void loginPageTesting(){
            //Test Case 003
            WebElement userName = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
            userName.sendKeys("john");

            WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
            password.sendKeys("demo");

            WebElement loginButton = driver.findElement(By.xpath("(//input[@value='Log In'])[1]"));
            loginButton.click();

            //Validation
            String expected = "ParaBank | Accounts Overview";
            String actual = driver.getTitle();

            if (expected.equals(actual)){
                System.out.println("Test is Complete");
            }else{
                System.out.println("Test is Failed");
            }

        }
}
