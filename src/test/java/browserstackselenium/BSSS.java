package browserstackselenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BSSS {
 
	@Test
  public void getBrowserTitle() throws MalformedURLException {
	  
	  final String AUTOMATE_USERNAME = "shashibhushanv1";
	  final String AUTOMATE_ACCESS_KEY = "xH13H2oYyxynhctD9Sx4";
	  final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  
//	  DesiredCapabilities caps = new DesiredCapabilities();
//	    caps.setCapability("os_version", "10");
//	    caps.setCapability("resolution", "1024x768");
//	    caps.setCapability("browser", "Chrome");
//	    caps.setCapability("browser_version", "latest");
//	    caps.setCapability("os", "Windows");    
//	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//	    driver.get("https://www.google.com");
//	    WebElement element = driver.findElement(By.name("q"));
//	    element.sendKeys("BrowserStack");
//	    element.submit();
//	    System.out.println(driver.getTitle());
//	    driver.quit();
	  
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("os", "Windows");
	  caps.setCapability("os_version", "10");
	  caps.setCapability("browser", "Edge");
	  caps.setCapability("browser_version", "84.0");
	  caps.setCapability("browserstack.local", "false");
	  caps.setCapability("browserstack.selenium_version", "3.141.59");

	  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Shashi bhushan Virajaji");
	    element.submit();
	    System.out.println(driver.getTitle());
	    driver.quit();
	  
  }
}
