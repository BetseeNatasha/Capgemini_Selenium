package WebelementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigation to URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement radio=driver.findElement(By.id("pollanswers-2"));
	    //verify the button is selected
		System.out.println("Is the good button selected:"+radio.isSelected());
		radio.click();
		Thread.sleep(2000);
		//verify the button is selected
		System.out.println("Is the good button selected after clicking:"+radio.isSelected());

	}

}
