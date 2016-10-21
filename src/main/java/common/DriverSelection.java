package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSelection {

	public static WebDriver driver;
	
	public static WebDriver getDriver()
	
	{
		String chromeDriver = System.getProperty("chromeDriver");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Muru\\SeleniumTestProject\\SeleniumTestProject\\src\\test\\resources\\Drivers\\chromedriver\\chromedriver.exe");
		
		         ChromeOptions options = new ChromeOptions();
	             options.addArguments("--disable-extensions");
	             DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	             capabilities.setCapability("chrome.binary", chromeDriver);
	             capabilities.setCapability(ChromeOptions.CAPABILITY, options);

	       //      options.addArguments("test-type");
	            

	             driver = new ChromeDriver(capabilities);
        return driver;
    }
	
//	public WebDriver select() {
//		
//		String chromeDriver = System.getProperty("chromeDriver");
//		
//	System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver/Chromedriver.exe");
//	
//	         ChromeOptions options = new ChromeOptions();
//             options.addArguments("--disable-extensions");
//             DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//             capabilities.setCapability("chrome.binary", chromeDriver);
//             capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//
//       //      options.addArguments("test-type");
//            
//
//             driver = new ChromeDriver(capabilities);
//             return driver;
//	}
}
