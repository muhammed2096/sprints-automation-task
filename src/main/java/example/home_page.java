package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home_page extends page_base{
    public home_page(WebDriver driver) {
        super(driver);
    }
    By searchBox = By.id("search");
    By searchButton = By.cssSelector("button[title='Search']");

public void setSearchBox(String insert_text){ Enter_text(searchBox, insert_text); }
public void setSearchButton(){ Click_btn(searchButton); }

}
