package javascriptAlerts_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				// Navigate to URL
				driver.get("");
				Thread.sleep(2000);
	}

}
