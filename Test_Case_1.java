package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_1 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.linkText("Facebook")).click();
    driver.findElement(By.linkText("Twitter")).click();
    driver.findElement(By.linkText("YouTube")).click();
    driver.findElement(By.name("search_query")).sendKeys("Monica Tamil Song");    
	}

}
