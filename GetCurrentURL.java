package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		System.out.println((driver.getCurrentUrl()));
		
		driver.get("https://www.google.com/");
		System.out.println((driver.getCurrentUrl()));
		Thread.sleep(2000);
		
		System.out.println(driver.getPageSource());
		driver.close();
	}
}