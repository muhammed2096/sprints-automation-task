import example.home_page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase1_searchTest extends test_base {
home_page home_obj;
@Test
public void validProductSearch() throws InterruptedException{
home_obj = new home_page(driver);
home_obj.setSearchBox("hoodie");
home_obj.setSearchButton();

    Thread.sleep(3000);
    boolean isResultShown = driver.findElements(By.cssSelector(".product-item")).size() > 0;
    Assert.assertTrue(isResultShown, "Search result should display hoodie products.");
}
}
