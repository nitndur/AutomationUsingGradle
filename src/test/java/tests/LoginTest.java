package tests;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserHomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginTest extends BaseTest {
    Properties prop = new Properties();
     @BeforeMethod
    public void loadProperty() throws IOException {
        String propFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\configuration.properties";
        prop.load(new FileInputStream(propFilePath));
    }
        @Test
        public void login() throws InterruptedException {

            HomePage homePage = new HomePage(driver);
            UserHomePage userHomePage = new UserHomePage(driver);

            homePage.launchAmazonUrl(prop.getProperty("url"))
                    .clickSignIn()
                    .enterEmail(prop.getProperty("username"))
                    .clickContinue()
                    .enterPassword("Yahoochat1")
                    .clickSignIn();
            userHomePage.verifySignIn();


        }

      /*  @Test
        public void test1(){
            System.out.println("In test1 method. It always succeeds.");
        }

        @Test(expectedExceptions = RuntimeException.class)
        public void test2(){
            System.out.println("In test2 method that expects runtime exception");
        }

        @Test
        public void test3(){
            throw new SkipException("Skipping the test3 method");
        }*/


    }

