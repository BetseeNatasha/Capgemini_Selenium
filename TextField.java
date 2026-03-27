package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.automationtesting.in/Register.html");
    Thread.sleep(5000);
    WebElement firstName=driver.findElement(By.cssSelector("[placeholder='First Name']"));
    firstName.sendKeys("Betsee");
    driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("A");
    Thread.sleep(3000);
    firstName.clear();
    Thread.sleep(3000);
    firstName.sendKeys("Monica");
	}

}
