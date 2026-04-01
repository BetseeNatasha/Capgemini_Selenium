package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathStarts_With_Ebay {

	public static void main(String[] args) throws InterruptedException {
  // //span[starts-with(text(),'To')]
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[starts-with(text(),'To')]")).click();
		
	}

}
