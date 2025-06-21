package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends page_base{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

     By emailField = By.id("customer-email");
     By passwordField = By.id("customer-password");
     By firstNameField = By.name("firstname");
     By lastNameField = By.name("lastname");
     By streetField = By.name("street[0]");
     By cityField = By.name("city");
     By zipField = By.name("postcode");
     By phoneField = By.name("telephone");
     By countryDropdown = By.name("country_id");
     By regionDropdown = By.name("region_id");
     By shipping_method = By.name("ko_unique_3");
     By nextButton = By.cssSelector("button.continue");
     By placeOrderBtn = By.className("checkout");


public void setFirstName(String firstName_input){Enter_text(firstNameField, firstName_input);}
public void setLastName(String lastName_input){Enter_text(lastNameField, lastName_input);}
public void setEmail(String email_input){Enter_text(emailField, email_input);}
public void setPassword(String password_input){Enter_text(passwordField, password_input);}
public void setStreetField(String street){Enter_text(streetField, street);}
public void setCityField(String city){Enter_text(cityField, city);}
public void setZipField(String zip){Enter_text(zipField, zip);}
public void setPhoneField(String phoneNum){Enter_text(phoneField, phoneNum);}
public void setCountryDropdown(String visible){Select_by_visible(countryDropdown, visible);}
public void setRegionDropdown(String visible){Select_by_visible(regionDropdown, visible);}
public void setShipping_method(){Click_btn(shipping_method);}
public void setNextButton(){Click_btn(nextButton);}
public void setPlaceOrderBtn(){Click_btn(placeOrderBtn);}
}
