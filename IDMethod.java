package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//1. Google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(2000);

		//2.  W3Schools
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("tnb-google-search-input")).sendKeys("CSS");
		Thread.sleep(2000);

		// 3. Facebook
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("Betsee Natasha");
		Thread.sleep(2000);

		// 4. Online Games
		driver.get("https://www.crazygames.com/");
		driver.findElement(By.id("search-input")).sendKeys("Chess");
		Thread.sleep(2000);

		// 5. LinkedIn
		driver.get("https://www.linkedin.com/checkpoint/rm/sign-in-another-account?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.findElement(By.id("username")).sendKeys("Betsee Natasha");
		Thread.sleep(2000);
		
		
		//6. Github   
		driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin");
		driver.findElement(By.id("login_field")).sendKeys("Betsee Natasha");
		Thread.sleep(2000);
		
		// 7. Amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(2000);
		
		// 8. DemoQA
		driver.get("https://demoqa.com/text-box");
        Thread.sleep(3000);
        driver.findElement(By.id("userName")).sendKeys("Betsee Natasha");
        Thread.sleep(1000);

		
		// 9. SacueDemo
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);

		
		// 10. Internet Herokuapp
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		Thread.sleep(1000);
		
		
	}
}