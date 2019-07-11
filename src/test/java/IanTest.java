 

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
 
public class IanTest {
 
// https://us1.appium.testobject.com/wd/hub 
	
public static final String USERNAME = "iflanagan";
 
public static final String ACCESS_KEY = "1CDFDE9A7065435585989327FD78B2F5"; // del api key 1CDFDE9A7065435585989327FD78B2F5 old api key 36BBAFFA55304E4A9B31B588812C399E
 
  public static final String DeviceName = "Samsung_Galaxy_S7_POC155";
public static final String url = "https://www.google.com/";


  //  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
 // public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@us1.appium.testobject.com/wd/hub ";    
    public static final String URL = "https://us1.appium.testobject.com/wd/hub";  


  public static void main(String[] args) throws Exception {
 
    DesiredCapabilities caps = new DesiredCapabilities("mobileChrome", "", Platform.ANY);
    caps.setCapability("testobject_api_key", ACCESS_KEY);
     caps.setCapability("deviceName", DeviceName);
     caps.setCapability("name", "Dell_POV_web_mobile_test"); 
     caps.setCapability("privateDevicesOnly", "true");
     //  caps.setCapability("platformName", "ios");  
     //  caps.setCapability("browserName", "MobileOS");
    caps.setCapability("deviceOrientation", "portrait");
  
     RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    //RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get(url);

    
    driver.quit();
  
  }
}