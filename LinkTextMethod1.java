package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTextMethod1 {
@Test
public void linkmethod() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://classroom.google.com/u/0/");

}
}
