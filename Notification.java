package HandlingNotification_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) throws InterruptedException {
    ChromeOptions options=new ChromeOptions();
    //1.
    options.addArguments("--disable-notifications");
    
    //2. 
    options.addArguments("--incognito");
    
    WebDriver driver=new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
    Thread.sleep(2000);
    driver.findElement(By.id("browNotButton")).click();
    System.out.println("Pass");
	}

}
