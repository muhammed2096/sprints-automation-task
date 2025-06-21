package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage extends page_base{
    public productPage(WebDriver driver) {
        super(driver);
    }

    By sizeOption = By.id("div[option-label='XL']");
    By colorOption = By.cssSelector("div[option-label='Black']");
    By addToCartButton = By.cssSelector("button[title='Add to Cart']");
    By cartIcon = By.cssSelector("a.action.showcart");
    By proceedToCheckout = By.id("top-cart-btn-checkout");

    public void setSizeOption(){Click_btn(sizeOption);}
    public void setColorOption(){Click_btn(colorOption);}
    public void setAddToCartButton(){Click_btn(addToCartButton);}
    public void setCartIcon(){Click_btn(cartIcon);}
    public void setProceedToCheckout(){Click_btn(proceedToCheckout);}


}
