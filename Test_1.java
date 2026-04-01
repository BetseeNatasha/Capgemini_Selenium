package Practice;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_1 {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).isDisplayed();
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(3000);
        Set<String> allWindows = driver.getWindowHandles();
        for(String window : allWindows) {
            if(!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        String url = driver.getCurrentUrl();
        if(url.contains("orangehrm.com")) {
            System.out.println("URL Validation Passed");
        }
        String title = driver.getTitle();
        if(!title.isEmpty()) {
            System.out.println("Title Validation Passed");
        }
        driver.close();
        driver.switchTo().window(parentWindow);
        if(driver.findElement(By.name("username")).isDisplayed()) {
            System.out.println("Login Page Displayed");
        }
        driver.quit();
    }
}
