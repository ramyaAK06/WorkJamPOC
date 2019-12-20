package pages;

import drivers.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchedulePage extends BasePage {
    @FindBy(css = "")
    private WebElement schedulePageTab;

    public SchedulePage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }
}
