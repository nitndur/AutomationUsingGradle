package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnButton(By element){
        waitForElement(element);
        driver.findElement(element).click();
    }

    public void enterText(By element, String text){
        waitForElement(element);
        driver.findElement(element).sendKeys(text);
    }

    public String getText(By element){
        waitForElement(element);
        return driver.findElement(element).getText();
    }

    public void waitForElement(By element){
        //WebDriverWait wait = new WebDriverWait(driver,10);
        // wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(element);
            }
        });

    }

    public void verifyTitle(String expected){
        Assert.assertEquals(driver.getTitle(),expected,"Not Signed In Properly");
    }
}
