package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;
@BeforeSuite
public void beforeSuite() {
	Reporter.log("Executing Suite",true);
}
@BeforeTest
public void beforeTest() {
	Reporter.log("Executing Test",true);
}
@BeforeClass
public void beforeClass() {
	Reporter.log("Executing Method",true);


 }
@BeforeMethod
public void beforeMethod() {
	Reporter.log("Executing Method",true);
	Reporter.log("Executing Method",true);
}
@AfterMethod
public void afterMethod() {
	Reporter.log("After Method Executed",true);
}
@AfterClass
public void afterClass() {
	Reporter.log("After Class Executed",true);
}

@AfterTest
public void afterTest() {
	Reporter.log("After Test Executed",true);
	
}
@AfterSuite
public void afterSuite() {
	Reporter.log("After Suite Executed",true);
}

}
