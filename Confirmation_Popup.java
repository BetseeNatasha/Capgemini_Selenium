package javascriptAlerts_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				// Navigate to URL
				driver.get("https://demo.automationtesting.in/Alerts.html");
				Thread.sleep(2000);
				driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
				Thread.sleep(2000);
				// handle popup and print the message on 
				Alert popup=driver.switchTo().alert();
				System.out.println(popup.getText());
				popup.dismiss();
	}

}
