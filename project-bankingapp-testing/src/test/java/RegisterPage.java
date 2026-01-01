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
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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

        WebElement zipcode = driver.findElement(By.xpath("(//input[@id='customer.address.zipCode'])[1]"));
        zipcode.sendKeys("1000");

        WebElement phone = driver.findElement(By.xpath("(//input[@id='customer.phoneNumber'])[1]"));
        phone.sendKeys("0711234567");

        WebElement ssn = driver.findElement(By.xpath("(//input[@id='customer.ssn'])[1]"));
        ssn.sendKeys("865-50-6891");

        WebElement userName = driver.findElement(By.xpath("(//input[@id='customer.username'])[1]"));
        userName.sendKeys("dDaniru");

        WebElement password = driver.findElement(By.id("customer.password"));
        password.sendKeys("daniru123");

        WebElement confirmPassword = driver.findElement(By.xpath("(//input[@id='repeatedPassword'])[1]"));
        confirmPassword.sendKeys("daniru123");

        WebElement registerButton = driver.findElement(By.xpath("(//input[@value='Register'])[1]"));
        registerButton.click();

        //Validation
        String expected = "ParaBank | Customer Created";
        String actual = driver.getTitle();

        if (expected.equals(actual)){
            System.out.println("Test is Complete");
        }else {
            System.out.println("Test is failed");
        }


    }
}
