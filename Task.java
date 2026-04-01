package WebelementInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				// Navigate to URL
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
			//Method 1 -> Java
				// Fetching the parent window id
				String parent_Id = driver.getWindowHandle();
				System.out.println(parent_Id);
				// Navigate to Facebook and print Facebook id
				driver.findElement(By.xpath("//a[.='Facebook']")).click();
				Set<String> FB_Id = driver.getWindowHandles();
				FB_Id.remove(parent_Id);
				String FB = "";
				for(String str : FB_Id) {		
					System.out.println("Facebook : " + str);	
					FB +=str;
				}
				// Navigate to X and print X id
				driver.findElement(By.xpath("//a[.='Twitter']")).click();
				Set<String> Twitter_Id = driver.getWindowHandles();
				Twitter_Id.remove(parent_Id);
				Twitter_Id.remove(FB);
				for(String str : Twitter_Id) {		
					System.out.println("Twitter : " + str);	
				}
}
}