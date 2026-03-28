package Select_Class_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByMethods {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.automationtesting.in/Register.html");
    Thread.sleep(2000);
    //id='Skills'
    WebElement dropdown=driver.findElement(By.id("Skills"));
    Select sel= new Select(dropdown);
    //calling select method
    
    
    //By index
    sel.selectByIndex(9);
    Thread.sleep(2000);
     
    
    //By value
    sel.selectByValue("Data Analytics");
    Thread.sleep(2000);
    
    //By Visible Text
    sel.selectByVisibleText("Engineering");
    Thread.sleep(2000);
    
    //By ContainsVisibleText
    sel.selectByContainsVisibleText("script");
    Thread.sleep(2000);
    driver.quit();
	}

}
