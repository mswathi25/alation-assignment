package cfg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;




public class WebDriverConfig {
	public static WebDriver createLocalDriver(String browserName) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		switch (browserName) {
        case BrowserType.CHROME:
            return new ChromeDriver();
        case BrowserType.IE:
            return new InternetExplorerDriver();
        case BrowserType.FIREFOX:
            return new FirefoxDriver();
        default:
            throw new Exception("Unknown local browser name.");
    }
	}

}