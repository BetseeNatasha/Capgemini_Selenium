package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.automationtesting.in/Register.html");
    Thread.sleep(2000);
    //click on the first check box
	 WebElement cricket=driver.findElement(By.id("checkbox1"));
	 cricket.click();
	 //un select the first check box
	 Thread.sleep(2000);
	 cricket.click();
	 
	}

}
