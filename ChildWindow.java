package popups_package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[@class='text-lg font-semibold text-gray-800']/..//button")).click();
		// switching the tool control to child window to perform actions on it's web
		// element
		String parentId = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		allwindowId.remove(parentId);
		for (String childId : allwindowId) {
			// switching the tool control to the child window popup
			driver.switchTo().window(childId);
		}
		// click on add to cart in child window
		WebElement addToCart = driver.findElement(By.tagName("button"));
		addToCart.click();
		addToCart.click();
		Thread.sleep(2000);
		WebElement cartlogo = driver.findElement(By.xpath("//*[local-name()='svg']"));
		cartlogo.click();
		Thread.sleep(2000);
		WebElement shoppingCarList = driver.findElement(By.tagName("h2"));
		if (shoppingCarList.isDisplayed())
			System.out.println("Test case status: Pass");
		else
			System.out.println("Test case status: Fail");
		driver.close();
	}

}
