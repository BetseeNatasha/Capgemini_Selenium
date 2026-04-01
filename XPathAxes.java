package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://demowebshop.tricentis.com/");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/parent::h2/following-sibling::div[@class='add-info']/child::div[@class='buttons']\r\n"
     		+ "")).click();
     
     }
}