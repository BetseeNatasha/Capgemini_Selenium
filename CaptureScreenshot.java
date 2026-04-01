package com.orangehrm.seleniumuiframework_generic_utility;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.orangehrm.seleniumframework.object_repository.DashboardPage;
import com.orangehrm.seleniumframework.object_repository.LoginPage;


public class CaptureScreenshot {

	@Test(invocationCount=3)
	public void screenShot() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wu=new WebDriverUtility(driver);
		LoginPage lp=new LoginPage(driver);
		DashboardPage dp=new DashboardPage(driver);
		ScreenshotUtility ss=new ScreenshotUtility(driver);
		//Creating a method for time-stamp
		//String timestamp=new SimpleDateFormat("yyyy-mm-dd-[hh-mm-ss]").format(new Date());
		wu.configMaximimizedBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
		Thread.sleep(3000);
		
		//Capture the ScreenShot of Home page
		ss.captureScreenshot(driver,"DashboardPage");
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File perm =new File("./Reports/dashboard"+timestamp+".png");
//		FileHandler.copy(temp, perm);
	
		//Capture the screenshot of web element
		ss.captureScreenshot(dp.getRecuitment(),"recruitmentLink");
//		WebElement recruitmentLink = dp.getRecrutmentLink();
//		File tempsrc=recruitmentLink.getScreenshotAs(OutputType.FILE);
//		File permTrg=new File("./Reports/recruitmentLink"+timestamp+".png");
//		FileHandler.copy(tempsrc, permTrg);
//		
		
	}
}