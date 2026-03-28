package com.orangehrm.seleniumuiframework_generic_utility;

import org.testng.annotations.BeforeSuite;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import com.orangehrm.seleniumframework.object_repository.DashboardPage;
import com.orangehrm.seleniumframework.object_repository.LoginPage;

@Listeners(com.orangehrm.seleniumuiframework_generic_utility.Listener_Implementation.class)
public class BaseClass {
	public WebDriver driver;
	String Browser;
	Properties prop;
	FileUtility fiu = new FileUtility();
	WebDriverUtility wdu;
	LoginPage lp;
	DashboardPage dsp;

	@BeforeSuite
	public void configBeforeSuite() {
		Reporter.log("---Exceuting before Suite---", true);
	}

	@BeforeTest
	public void configBeforeTest() {
		Reporter.log("---Exceuting before Test---", true);
	}

	@Parameters("BROWSER")
	@BeforeClass(groups = { "Regression", "Smoke" })
	public void beforeClass() throws IOException {
		Reporter.log("---Exceuting before Class---", true);
		Browser = fiu.getPropertyKeyValue("browser");
		if (Browser.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.contains("edge")) {
			driver = new EdgeDriver();
		} else if (Browser.contains("firefox")) {
			driver = new FirefoxDriver();
		}
		wdu = new WebDriverUtility(driver);
		lp = new LoginPage(driver);
		dsp = new DashboardPage(driver);
		wdu.configMaximimizedBrowser();
		wdu.waitForElementsToLoad(20);

	}

	@BeforeMethod
	public void configBeforeMethod() throws IOException {

		Reporter.log("---Exceuting before Method---", true);
		String URL = fiu.getPropertyKeyValue("url");
		String ValidUserName = fiu.getPropertyKeyValue("username");
		String ValidPassword = fiu.getPropertyKeyValue("password");

		// login
		wdu.navigateToApplication(URL);
		lp.login(ValidUserName, ValidPassword);
	}

	@AfterMethod
	public void configAfterMethod() {
		Reporter.log("---Logging Out---", true);
		dsp.logout();
	}

	@AfterClass
	public void configAfterClass() {
		Reporter.log("---Exceuting after Class---", true);
		wdu.CloseBrowserWindow();
	}

	@AfterTest
	public void configAfterTest() {
		Reporter.log("---Exceuting after Test---", true);
	}

	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("---Exceuting after Suite---", true);
	}

}