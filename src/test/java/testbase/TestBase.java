package testbase;

import drivers.DriverInitializer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    private WebDriver driver;
    protected HomePage homePage;
    protected ConfigReader configReader;

    @BeforeMethod
    public void setup() throws Exception {
        driver = new DriverInitializer("chrome").init();
        configReader = new ConfigReader();
       // homePage = new HomePage();
    }

    public void navigateToUrl(String url){
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void quit(){
        if(driver!=null){
            driver.quit();
        }
    }
}
