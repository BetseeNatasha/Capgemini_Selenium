package Select_Class_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Select sel = new Select(driver.findElement(By.id("select-multiple-native")));

		// select by index for multiple drop down
		sel.selectByVisibleText("John Hardy Women's L...");
		Thread.sleep(2000);
		sel.deselectByIndex(4);

		sel.selectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		sel.deselectByValue("Solid Gold Petite Micropave ");

		sel.selectByVisibleText("White Gold Plated Pr...");
		Thread.sleep(2000);
		sel.deselectByVisibleText("White Gold Plated Pr...");

		sel.selectByVisibleText("Pierced Owl Rose Gol...");
		Thread.sleep(2000);
		sel.deSelectByContainsVisibleText("Pierced Ow");

		driver.findElement(By.xpath("//button[. = 'Add']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
