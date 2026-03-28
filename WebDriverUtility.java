package com.orangehrm.seleniumuiframework_generic_utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	WebDriverWait wait;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	// 1. Manage

	// 1.1 Maximize
	public void configMaximimizedBrowser() {
		driver.manage().window().maximize();
	}

	// 1.2 Minimize
	public void configMinimizedBrowser() {
		driver.manage().window().minimize();
	}

	// 1.3 Full screen
	public void configFullscreenBrowser() {
		driver.manage().window().fullscreen();
	}

	// 1.4 Fetch size
	public Dimension fetchSize() {
		Dimension dimension = driver.manage().window().getSize();
		return dimension;
	}

	// 1.5 Get size
	public void configBrowserSize(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}

	// 1.6 Set position
	public void configBrowserCoordinates(int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}

	// 2. Navigate

	// 2.1 Navigate to
	public void navigateToApplication(String url) {
		driver.navigate().to(url);
	}

	// 2.2 Forward
	public void navigateForward() {
		driver.navigate().forward();
	}

	// 2.3 Backward
	public void navigateBackward() {
		driver.navigate().back();
	}

	// 2.4 Refresh
	public void refreshCurrentPage() {
		driver.navigate().refresh();
	}

	// 2.5 Get
	public void getUrl(String url) {
		driver.get(url);
	}

	// 2.6 Get Title
	public String getTitle(String url) {
		String title = driver.getTitle();
		return title;
	}

	// 2.7 Current Title
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	// 2.8 Close
	public void closingTab() {
		driver.close();
		;
	}

	// 2.9 Quit
	public void CloseBrowserWindow() {
		driver.quit();
	}

	// 3. Timeouts
	public void waitForElementsToLoad(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	// 4. Explicit Wait
	public void waitTillTheElementIsClickable(WebElement element, long maximumTimeToWait) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// 5. Popups
	// 5.1 Alert
	public void clickOnAccept() {
		driver.switchTo().alert().accept();
	}

	// 5.2 Confirmation
	public void clickOnDismiss() {
		driver.switchTo().alert().dismiss();
	}

	// 5.3 Type message in js prompt
	public void typeMessageInJavascriptPopup(String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	// 5.4 Fetch message in js prompt
	public String fetchJavascriptPopupMessage() {
		String message = driver.switchTo().alert().getText();
		return message;
	}
	
	// Child Window Switching
	public void windowSwitchingByUrl(String childApplicationTitle) {
		String parentId=driver.getWindowHandle();
		Set<String>allwindowId= driver.getWindowHandles();
		allwindowId.remove(parentId);
		for (String childId : allwindowId) {
			driver.switchTo().window(childId);
			String title=driver.getTitle();
			if(title.contains(childApplicationTitle))
			break;
	}
}
	// 6. Frame
 public void switchToFrameByIndex(int indexNo) {
	 driver.switchTo().frame(indexNo);
 }
 
 public void switchToFrameByIdOrName(String idOrNameValue) {
	 driver.switchTo().frame(idOrNameValue);
 }
 
 public void switchToFrameByFrameElement(WebElement frameElement) {
	 driver.switchTo().frame(frameElement);
 }
 
 public void switchBacktheControltoPreviousFrame() {
	 driver.switchTo().parentFrame();
 }

 public void switchBacktheControltoMainPage() {
	 driver.switchTo().defaultContent();
 }
 
}
