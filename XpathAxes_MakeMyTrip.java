package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxes_MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.makemytrip.com/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/../../..//a[@data-cy='superOfferCtaText1']")).click();
	}
}