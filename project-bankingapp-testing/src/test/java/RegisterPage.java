import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPage {
    WebDriver driver;

    @BeforeMethod
    public void registerPageBeforeTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @Test
    public void registerPageTest(){
        //Test Case 002
        WebElement firstName = driver.findElement(By.xpath("(//input[@id='customer.firstName'])[1]"));
        firstName.sendKeys("Daniru");

        WebElement lastName = driver.findElement(By.xpath("(//input[@id='customer.lastName'])[1]"));
        lastName.sendKeys("Dayarathna");

        WebElement address = driver.findElement(By.xpath("(//input[@id='customer.address.street'])[1]"));
        address.sendKeys("22/1, ABC Road");

        WebElement city = driver.findElement(By.xpath("(//input[@id='customer.address.city'])[1]"));
        city.sendKeys("Colombo");

        WebElement state = driver.findElement(By.xpath("(//input[@id='customer.address.state'])[1]"));
        state.sendKeys("Western Province");
    }
}
