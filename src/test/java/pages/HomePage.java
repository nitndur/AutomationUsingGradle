package pages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ExtentReports.ExtentTestManager;

public class HomePage extends BasePage {
    By signInBtn = By.xpath("//span[contains(text(),'Hello')]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage launchAmazonUrl(String url){
        driver.get(url);
        ExtentTestManager.getTest().log(LogStatus.INFO,"Lauched Amazon URL");
        return this;
    }

    public SignInPage clickSignIn() throws InterruptedException {
        clickOnButton(signInBtn);
        ExtentTestManager.getTest().log(LogStatus.INFO,"Clicked on Sign In button");
        // Thread.sleep(3000);
        return new SignInPage(driver);
    }
}
