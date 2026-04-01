package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class LoginTest {
	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(2000);
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
     WebElement homepage = driver.findElement(By.xpath("//h6"));
     if(homepage.isDisplayed()) {
		 System.out.println("Login successful");
	}
     else {
		 System.out.println("Login failed");
	}
	}
}