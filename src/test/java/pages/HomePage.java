package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By signInBtn = By.xpath("//span[contains(text(),'Hello')]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage launchAmazonUrl(String url){
        driver.get(url);
        return this;
    }

    public SignInPage clickSignIn() throws InterruptedException {
        clickOnButton(signInBtn);
        System.out.println("Clicked SignIn button");
        // Thread.sleep(3000);
        return new SignInPage(driver);
    }
}
