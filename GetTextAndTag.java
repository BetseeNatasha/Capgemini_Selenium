package WebelementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndTag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement aboutLink = driver.findElement(By.id("navbarDropdown"));
		System.out.println("Name of the link is: " + aboutLink.getText());
		// fetching the tag name
		System.out.println("The tag name is: " + aboutLink.getTagName());
	}
}