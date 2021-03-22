package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudDevice implements IDevice{

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
      caps.setCapability("browserstack.user", "vladimirvargas1");
      caps.setCapability("browserstack.key", "cZyn5gjLBjZpLtcZU8rH");

    // Set URL of the application under test
      caps.setCapability("app", "bs://e9d34e8b5d3877ae7f777e048c9d838f55bbaa60");

    // Specify device and os_version for testing
      caps.setCapability("device", "Google Pixel 3");
      caps.setCapability("os_version", "9.0");

    // Set other BrowserStack capabilities
      caps.setCapability("project", "First Java Project");
      caps.setCapability("build", "Java Android");
      caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        return driver;
    }
}
