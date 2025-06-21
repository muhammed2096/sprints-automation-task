import example.home_page;
import example.productPage;
import org.testng.annotations.Test;

public class testCase2_AddToCartTest extends test_base{
home_page home_obj;
productPage product_obj;

@Test
    public void validAddToCart(){
    home_obj = new home_page(driver);
    home_obj.setSearchBox("hoodie");
    home_obj.setSearchButton();
    product_obj = new productPage(driver);
    product_obj.setSizeOption();
    product_obj.setColorOption();
    product_obj.setAddToCartButton();
    product_obj.setCartIcon();
    product_obj.setProceedToCheckout();
}

}
