package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
    //ChromeDriver driver = new ChromeDriver();
    //RemoteWebDriver driver1 = new ChromeDriver();
		//WebDriver driver2 = new FirefoxDriver();-->optimized code
		
		
		String browser = "edge";
		WebDriver driver=null;// so that garbage value is not assigned to driver and we can assign value to driver in if condition
		if(browser.contains("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.contains("edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.contains("firefox")) {
			driver = new FirefoxDriver();
		}
	}
}