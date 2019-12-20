package testcases;

import org.testng.annotations.Test;
import testbase.TestBase;

public class HomePageTest extends TestBase {

    @Test
    public void launchUrl(){
        navigateToUrl(configReader.getBaseUrl("baseUrl"));
    }
}
