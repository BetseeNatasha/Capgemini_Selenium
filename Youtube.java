package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.youtube.com/");
    Thread.sleep(8000);
    driver.findElement(By.name("search_query")).sendKeys("Meri Zindagi Hai Tu");
        
	}

}
