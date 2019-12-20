package browserFactory;

import org.openqa.selenium.WebDriver;

public interface BrowserDriver {

    WebDriver getDriver();
    public void setBinaryPath();
}
