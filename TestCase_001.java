package generic_utility;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase_001 {

	WebDriver driver;

	@Test(priority = 0)
	public void login() {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");

		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login Status: Passed");
		} else {
			System.out.println("Login Status: Failed");
		}

		sa.assertAll();
	}

	@Test(priority = 1, dependsOnMethods = "login")
	public void addToCart() {

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
	}

	@Test(priority = 2, dependsOnMethods = "addToCart")
	public void checkCart() {
		// checking
		List<WebElement> products = driver.findElements(By.cssSelector(".cart_item"));
		String result = "";
		for (WebElement item : products) {
			result = result + item.getText();
		}
		if (result.contains("Sauce Labs Bike Light") && result.contains("Sauce Labs Backpack")) {
			System.out.println("Cart Verification: PASS");
		} else {
			System.out.println("Cart Verification: FAIL");
		}
		// Checkout
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Betsee");
		driver.findElement(By.id("last-name")).sendKeys("Natasha");
		driver.findElement(By.id("postal-code")).sendKeys("600118");
		driver.findElement(By.id("continue")).click();
	}

	@Test(priority = 3, dependsOnMethods = "checkCart")
	public void completeOrder() {
		// validating price complete order
		String totalPrice = driver.findElement(By.className("summary_total_label")).getText();
		String expectedTotalprice = "Total: $43.18";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expectedTotalprice, totalPrice);
		if (totalPrice.equals(expectedTotalprice)) {
			System.out.println("Total price verification:Pass");
		} else {
			System.out.println("Total price verification:Fail");
		}

	}

	@Test(priority = 4, dependsOnMethods = "login")
	// logout method
	public void logout() {

		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();

	}
}