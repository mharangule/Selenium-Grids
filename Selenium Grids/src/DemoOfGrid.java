import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoOfGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities d=new DesiredCapabilities();
		d.setBrowserName("chrome");
		d.setPlatform(Platform.WINDOWS);
		
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.104:4444/wd/hub"),d);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	

}
