package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAttribute_text_contains {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1️ XPath using ATTRIBUTE 

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@id='male']")).click();
        driver.findElement(By.xpath("//input[@id='sunday']")).click();


        // 2️ XPath using text() 

        driver.findElement(By.xpath("//td[text()=\'Learn Selenium\']"));
        driver.findElement(By.xpath("//td[text()='Internet Explorer']"));
        driver.findElement(By.xpath("//td[text()='Amod']"));
        driver.findElement(By.xpath("//a[text()='Udemy Courses']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Upcoming Batches']")).click();
        Thread.sleep(3000);
        
        
//        3️  XPath using contains() 
           driver.get("https://demowebshop.tricentis.com/");
           driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
           driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click();
           driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
           driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
           driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
       Thread.sleep(3000);
    
    }
}