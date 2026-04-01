package WebelementInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demowebshop.tricentis.com/");
   Thread.sleep(2000);
   String expectedTitle = "Demo Web Shop";
   String actualTitle = driver.getTitle();
   if(expectedTitle.equals(actualTitle)) {
	   System.out.println("Title verification is passed");
   }
   else {
	   System.out.println("Title verification is failed");
   }
   driver.quit();
	}

}
