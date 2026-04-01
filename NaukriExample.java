package HandlingFileUploadPopup_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriExample {

	public static void main(String[] args) throws InterruptedException {
   // https://www.naukri.com/registration/createAccount?othersrcp=22636
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-val='exp']")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\DELL\\Downloads\\Betsee_Natasha_A_Resume_CSE.pdf");
		
	}

}
