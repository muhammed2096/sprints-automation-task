import example.CheckoutPage;
import example.home_page;
import example.productPage;
import org.testng.annotations.Test;

public class testCase3_placeOrder extends test_base{
    home_page home_obj;
    productPage product_obj;
    CheckoutPage checkout_obj;

    @Test
    public void place_order(){
        home_obj = new home_page(driver);
        home_obj.setSearchBox("hoodie");
        home_obj.setSearchButton();
        product_obj = new productPage(driver);
        product_obj.setSizeOption();
        product_obj.setColorOption();
        product_obj.setAddToCartButton();
        product_obj.setCartIcon();
        product_obj.setProceedToCheckout();
        checkout_obj = new CheckoutPage(driver);
        checkout_obj.setEmail("test5123@gmail.com");
        checkout_obj.setPassword("2091996mM");
        checkout_obj.setFirstName("muhammad");
        checkout_obj.setLastName("Moustafa");
        checkout_obj.setStreetField("13st test");
        checkout_obj.setCityField("miami");
        checkout_obj.setRegionDropdown("Florida");
        checkout_obj.setZipField("12345");
        checkout_obj.setCountryDropdown("United States");
        checkout_obj.setPhoneField("012311210");
        checkout_obj.setShipping_method();
        checkout_obj.setNextButton();
        checkout_obj.setPlaceOrderBtn();

    }
}
