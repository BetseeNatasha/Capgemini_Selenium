package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate()
				.to("https://icehrm-open.gamonoid.com/login.php?next=P2c9YWRtaW4mbj1kYXNoYm9hcmQmbT1hZG1pbl9BZG1pbg");
		driver.findElement(By.id("username")).sendKeys("Betsee");
		driver.findElement(By.id("password")).sendKeys("betsee");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase']")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase']")).click();
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		driver.findElement(By.xpath("//span[text()='Employees']")).click();
		driver.findElement(By.linkText("Skills")).click();
		driver.findElement(By.className("ant-modal-close")).click();
		driver.findElement(By.className("ant-table-cell")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='IceHrm ']")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}

}
