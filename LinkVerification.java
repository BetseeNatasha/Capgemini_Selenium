package WebelementInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkVerification {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String expectedLink = "https://demowebshop.tricentis.com/";
		String actualLink = driver.getCurrentUrl();
		if (expectedLink.equals(actualLink)) {
			System.out.println("Link verification is passed");
		} else {
			System.out.println("Link verification is failed");
		}
		driver.quit();
	}

}
