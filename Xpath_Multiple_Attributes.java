package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Multiple_Attributes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='vl-flyout-nav__link-container' and @_sp='p4624852.m1379.l3250' and @href='https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545' ]")).click();
	}

}
