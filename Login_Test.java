package practice;


import org.testng.annotations.Test;

import object_repository.BaseClass;
import object_repository.LoginPage;

public class Login_Test extends BaseClass {
	@Test
	public void logIn() {
		LoginPage lp= new LoginPage(driver);
		lp.enterUrl("https://www.saucedemo.com/");
		lp.enterUserName("standard_user");
		lp.enterPassword("secret_sauce");
		lp.clickLogin();
		}
}
