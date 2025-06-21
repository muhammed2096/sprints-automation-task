import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class test_base {
    WebDriver driver;
    @BeforeMethod
    public void open_browser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");
    }

    @AfterMethod
    public void close_browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

