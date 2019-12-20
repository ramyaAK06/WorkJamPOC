package pages;

import drivers.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(css = "")
    private WebElement homePageTab;

    public HomePage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }


}
