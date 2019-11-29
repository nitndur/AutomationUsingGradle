package pages;

import org.openqa.selenium.WebDriver;

public class UserHomePage extends BasePage {
    public UserHomePage(WebDriver driver) {
        super(driver);
    }
    public UserHomePage verifySignIn(){
        //System.out.println(driver.getTitle());
        verifyTitle("Amazon.com.au: Shop online for Electronics, Apparel, Toys, Books, DVDs & more");
        return this;
    }
}
