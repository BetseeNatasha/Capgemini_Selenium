package practice;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
	@Test
	public void testMethod() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		// Hard Assertion
		Assert.assertEquals(actualTitle, expectedTitle);
		if (expectedTitle.equals(actualTitle))
			System.out.println("Status : Pass");
		else
			System.out.println("Status : Fail");
		Assert.assertTrue(expectedTitle.equals(actualTitle));
	}
}
