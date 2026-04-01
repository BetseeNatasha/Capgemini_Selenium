package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Successfully opened Google.");
        } else {
            System.out.println("Failed to open Google.");
        }
        driver.findElement(By.name("q")).sendKeys("Amazon");
        Thread.sleep(3000);
        driver.quit();
    }
}