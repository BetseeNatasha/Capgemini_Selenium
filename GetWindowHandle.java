package WebelementInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.navigate().to(
				"https://www.myntra.com/?utm_source=gh_toi&utm_medium=toi_rev&utm_campaign=gh_toi_Inf_11&gad_source=1&gad_campaignid=23560713083&gbraid=0AAAABBVk_S9Gl3O3TrH7Gi0kssiNVqq6p&gclid=CjwKCAiAh5XNBhAAEiwA_Bu8FbEBH77w87384XrZng90UWia6BTICY_aojaDRNgogjMJUa65xC7oWhoCEH0QAvD_BwE");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.quit();
	}

}
