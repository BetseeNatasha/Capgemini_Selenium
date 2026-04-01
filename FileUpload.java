package HandlingFileUploadPopup_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				// Navigate to URL
				driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
				Thread.sleep(2000);
				//Avoiding the file upload popup
				driver.findElement(By.id("resume")).sendKeys("C:\\Users\\DELL\\Downloads\\Panimalar College Calendar updated (2).pdf");
			
	}

}
