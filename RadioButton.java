package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new ChromeDriver();
   driver.get("https://demo.automationtesting.in/Register.html");
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.findElement(By.cssSelector("[value='Male']")).click();
	}
}