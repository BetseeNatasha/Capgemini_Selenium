package generic_utility;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_002 {
	WebDriver driver;

	@Test(priority = 0)
	public void LaunchingBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 1, dependsOnMethods = "LaunchingBrowser")
	public void Login() {
		driver.get("https://www.saucedemo.com/");
		// Login with valid credentials
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}
	
	@Test(priority = 2, dependsOnMethods = "Login")
	public void filter() {
		//Sort
		driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='lohi']")).click();
		driver.findElement(By.xpath("//button[.= 'Add to cart']")).click();
		
		//Add to Cart
		driver.findElement(By.className("shopping_cart_link")).click();
		//Verify Product in Cart
		String res = "Sauce Labs Onesie";
		WebElement cart = driver.findElement(By.className("inventory_item_name"));
		Assert.assertEquals(cart.getText(), res);
	}
	@Test(priority = 3, dependsOnMethods = "filter")
	public void checkout() {
		//checkout
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Betsee");
		driver.findElement(By.id("last-name")).sendKeys("Natasha");
		driver.findElement(By.id("postal-code")).sendKeys("600118");

		driver.findElement(By.name("continue")).click();
		//Verifying  Order Summary and Complete Order
		WebElement price = driver.findElement(By.className("inventory_item_price"));
		double total = 0;
			String cleaned = price.getText().replace("$", "");
			double num = Double.parseDouble(cleaned);
			total = total + num;		
		

		total += 0.64;
		//Validate
		Assert.assertEquals(total, 8.63);

		
		//Logout
		driver.findElement(By.id("finish")).click();
		
		driver.close();
	}
}