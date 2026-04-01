package Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_TestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
		Thread.sleep(3000);
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");
     driver.findElement(By.xpath("//button[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@class='oxd-main-menu-item' and @href='/web/index.php/pim/viewPimModule']")).click();
     driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
     Thread.sleep(3000);
     driver.findElement(By.name("firstName")).sendKeys("Johnny");
     Thread.sleep(3000);
     driver.findElement(By.name("middleName")).sendKeys("Doe");
     Thread.sleep(3000);
     driver.findElement(By.name("lastName")).sendKeys("A");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
	}
}