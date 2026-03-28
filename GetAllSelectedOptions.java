package Select_Class_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement listbox = driver.findElement(By.id("cars"));
		Select sel = new Select(listbox);
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Opel");
		// verifying if all the options above are selected or not
		List<WebElement> alloptions = sel.getAllSelectedOptions();
		for(WebElement s:alloptions) {
			System.out.println(s.getText());
		}
		Thread.sleep(2000);
		driver.quit();

	}
}
