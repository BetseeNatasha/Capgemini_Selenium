package WebelementInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    		driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
    String parentWindow=driver.getWindowHandle();
    System.out.println("Parent ID: "+parentWindow);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//h2[text()='Watches']/..//button")).click();
    Thread.sleep(2000);
    Set<String>allWindows=driver.getWindowHandles();
    System.out.println("Window IDs of both Parent and Child: "+allWindows);
    allWindows.remove(driver.getWindowHandle());
    System.out.println(allWindows);
    for(String window:allWindows) {
    	System.out.println(window);
    }
    Thread.sleep(2000);
    driver.quit();
	}
}