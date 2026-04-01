package popups_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewWindow {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.wikipedia.org");
		Thread.sleep(2000);
		// triggering a new window in the same browser and parallely switching the tool
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://github.com/");
 
	}

}
