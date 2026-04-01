package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
    driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
    driver.findElement(By.xpath("//a[@class='oxd-userdropdown-link'  and @href='/web/index.php/pim/updatePassword']")).click();
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    driver.getCurrentUrl();
    Thread.sleep(2000);
    driver.quit();
    
	}

}
