package Practice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_Case_2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate()
				.to("https://icehrm-open.gamonoid.com/login.php?next=P2c9YWRtaW4mbj1kYXNoYm9hcmQmbT1hZG1pbl9BZG1pbg");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase']")).click();
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		driver.findElement(By.id("employeeLink")).click();
		driver.findElement(By.xpath("//a[@href='https://icehrm-open.gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		driver.findElement(By.xpath("//span[text()='Filter Employees']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.findElement(By.className("ant-tag ant-tag-blue css-dev-only-do-not-override-240cud")).isDisplayed();
		driver.findElement(By.xpath("//span[text()='Filter Employees']")).click();
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='QA Team']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.findElement(By.className("ant-tag ant-tag-blue css-dev-only-do-not-override-240cud")).isDisplayed();
		driver.findElement(By.xpath("//span[text()='IceHrm ']")).click();
		driver.findElement(By.linkText("Sign out")).click();		
	}
}