import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {
	
	@SuppressWarnings("unused")
	private WebDriver driver;

	
	public void checkSauceLab() {
		WebDriver driver = null;
		String sauceURL = "https://@ondemand.saucelabs.com:443/wd/hub";
		String username = "aravinth";
		String accesskey = "45d9e77e-180c-4a06-9a3d-d976b74bab9f";
		String host="https://aravinth:45d9e77e-180c-4a06-9a3d-d976b74bab9f@ondemand.saucelabs.com:443/wd/hub";
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platform", "Windows 8.1");
		desiredCapabilities.setCapability("version", "72");
		desiredCapabilities.setCapability("browserName", "chrome");
	//	desiredCapabilities.setCapability("username", username);
	//	desiredCapabilities.setCapability("accessKey", accesskey);
		// desiredCapabilities.setCapability("screen-resolution","800x600");
		desiredCapabilities.setCapability("name", "SauceTest_1");
		
		try {
			
			driver = new RemoteWebDriver(new URL(host), desiredCapabilities);
			
			driver.get("https://www.google.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SauceLabsTest check=new SauceLabsTest();
		check.checkSauceLab();
	}

}