package swag_labs;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository_PageFactory.LoginPage;

public class LoginPageFactoryTest {
	WebDriver driver;
	@Test
public void login() {
	LoginPage lp=new LoginPage(driver);
	lp.enterUrl("https://www.saucedemo.com/");
	lp.login("standard_user", "secret_sauce");
	lp.clickLoginBtn();
}
}
