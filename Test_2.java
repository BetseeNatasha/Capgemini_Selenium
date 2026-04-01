package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);

		String value1 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).getText();
		System.out.println("Selected Value: " + value1);

		driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='ESS']")).click();
		Thread.sleep(2000);

		String value2 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).getText();
		System.out.println("Selected Value: " + value2);

		driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Cancel']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

		driver.quit();

	}

}
