package WebelementInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.linkText("Facebook")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.linkText("Twitter")).click();
         Set<String>allWindows=driver.getWindowHandles();
         for(String str:allWindows) {
         driver.switchTo().window(str);
         String title=driver.getTitle();
         Thread.sleep(2000);
         System.out.println("ID"+str);
         System.out.println("title"+title);
         }
	}

}
