import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenAccPage {
    WebDriver driver;

    @BeforeMethod
    public void openAccountPageBeforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }

    @Test
    public void openAccPageTest(){
        WebElement userName = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
        userName.sendKeys("john");

        WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
        password.sendKeys("demo");

        WebElement loginButton = driver.findElement(By.xpath("(//input[@value='Log In'])[1]"));
        loginButton.click();

        driver.get("https://parabank.parasoft.com/parabank/openaccount.htm");
        WebElement openAccDropdown = driver.findElement(By.xpath("(//select[@id='type'])[1]"));
        openAccDropdown.click();
        WebElement dropdown2 = driver.findElement(By.xpath("(//select[@id='fromAccountId'])[1]"));
        dropdown2.click();
        WebElement openAccButton = driver.findElement(By.xpath("(//input[@value='Open New Account'])[1]"));
        openAccButton.click();
    }
}
