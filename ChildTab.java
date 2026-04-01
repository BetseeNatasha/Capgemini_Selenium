package popups_package;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTab {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-index='3']")).click();
        Thread.sleep(2000);
        Set<String>allWindowId=driver.getWindowHandles();
        String parentid=driver.getWindowHandle();
        allWindowId.remove(parentid);
        for(String childId:allWindowId) {
        	driver.switchTo().window(childId);
        }
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);
        driver.close();
	}
}