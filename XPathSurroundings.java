package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSurroundings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/duplicate");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Samsung']/..//input[@class='mr-2 h-5 w-5']")).click();
		driver.findElement(By.xpath("//label[text()=' RedMi ']/..//input[@type='checkbox']")).click();

	}

}
