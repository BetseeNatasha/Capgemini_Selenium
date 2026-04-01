package demo;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumframework.object_repository.DashboardPage;
import com.orangehrm.seleniumframework.object_repository.LoginPage;
import com.orangehrm.seleniumuiframework_generic_utility.WebDriverUtility;


public class CaptureScreenshot {
	
	@Test(invocationCount = 2)
	public void screenshot() throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverUtility wu = new WebDriverUtility(driver);
		LoginPage lp = new LoginPage(driver);
		DashboardPage dbp = new DashboardPage(driver);
		
		String TimeStramp = new SimpleDateFormat("yyyy-mm--dd[hh-mm-ss]").format(new Date());
		
		wu.configMaximimizedBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
	
		Thread.sleep(5000);
		
		//Capture the screenshot of Homepage
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File per = new File("./Reports/dashboard"+ TimeStramp +".png");
		FileHandler.copy( temp, per);
		
		//Capture the screenshot of webElement
		WebElement recruitment_link = dbp.getRecuitment() ;
		File temp_ele = recruitment_link.getScreenshotAs(OutputType.FILE);
		File per_ele = new File("./Reports/recruitment"+ TimeStramp+".png");
		FileHandler.copy(temp_ele, per_ele);
	}
}