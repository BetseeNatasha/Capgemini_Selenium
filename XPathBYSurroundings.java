package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathBYSurroundings {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://demowebshop.tricentis.com/");
     Thread.sleep(3000);
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//a[text()='Build your own computer']/../..//input[@class='button-2 product-box-add-to-cart-button']")).click();
	}
}

