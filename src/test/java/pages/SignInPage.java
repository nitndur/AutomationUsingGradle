package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    WebDriver driver ;
    By emailTxtBx = By.id("ap_email");
    By continueBtn = By.id("continue");
    By passwordTxtBx = By.id("ap_password");
    By signInBtn = By.id("signInSubmit");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage enterEmail(String email){
        enterText(emailTxtBx,email);
        return this;
    }
    public SignInPage clickContinue(){
        clickOnButton(continueBtn);
        return this;
    }
    public SignInPage enterPassword(String password){
        enterText(passwordTxtBx,password);
        return this;
    }

    public UserHomePage clickSignIn(){
        clickOnButton(signInBtn);
        return new UserHomePage(driver);
    }


}
