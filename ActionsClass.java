package Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Navigate to Demo Qspiders
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");

		// using click and hold
		WebElement ele = driver.findElement(By.id("circle"));
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.id("circle"))).pause(3000).perform();
		act.moveToElement(ele).clickAndHold().pause(2000).release().perform();
        
	}
}