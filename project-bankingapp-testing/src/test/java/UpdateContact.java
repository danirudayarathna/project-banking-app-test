import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdateContact {

    WebDriver driver;


    @BeforeMethod
    public void updateContactBeforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void updateContactTest(){


        WebElement userName = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
        userName.sendKeys("john");

        WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
        password.sendKeys("demo");

        WebElement loginButton = driver.findElement(By.xpath("(//input[@value='Log In'])[1]"));
        loginButton.click();

        driver.get("https://parabank.parasoft.com/parabank/updateprofile.htm");

        WebElement firstName = driver.findElement(By.xpath("(//input[@id='customer.firstName'])[1]"));
        firstName.clear();
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.xpath("(//input[@id='customer.lastName'])[1]"));
        lastName.clear();
        lastName.sendKeys("Smith");

        WebElement address = driver.findElement(By.xpath("(//input[@id='customer.address.street'])[1]"));
        address.clear();
        address.sendKeys("1431 Main St");

        WebElement city = driver.findElement(By.xpath("(//input[@id='customer.address.city'])[1]"));
        city.clear();
        city.sendKeys("Beverly Hills");

        WebElement state = driver.findElement(By.xpath("(//input[@id='customer.address.state'])[1]"));
        state.clear();
        state.sendKeys("CA");

        WebElement zipcode = driver.findElement(By.xpath("(//input[@id='customer.address.zipCode'])[1]"));
        zipcode.clear();
        zipcode.sendKeys("90210");

        WebElement updateButton = driver.findElement(By.xpath("(//input[@value='Update Profile'])[1]"));
        updateButton.click();
    }
}
