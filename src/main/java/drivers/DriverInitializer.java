package drivers;

import browserFactory.ChromeBrowser;
import browserFactory.FirefoxBrowser;
import constant.Browsers;
import org.openqa.selenium.WebDriver;

public class DriverInitializer {

    private String browser;
    public DriverInitializer(String browser) {
        this.browser = browser;
    }
    public WebDriver init() throws Exception {
        WebDriver webDriver = null;
        switch (browser) {
            case Browsers.FIREFOX:
                webDriver = new FirefoxBrowser().getDriver();
                break;
            case Browsers.CHROME:
            default:
                webDriver = new ChromeBrowser().getDriver();
        }
        DriverProvider.setDriver(webDriver);
        return webDriver;
    }
}
