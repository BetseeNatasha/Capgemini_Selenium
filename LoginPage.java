package ObjectRepository_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//it will automatically initialize the located WE on calling
		PageFactory.initElements(driver, this);
	}
@FindBy(id="user-name")
WebElement userName;

@FindBy(id="password")
WebElement password;

@FindBy(id="login-button")
WebElement loginBtn;

//Business logic to login
public void enterUrl(String url) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
}
public void login(String un, String pwd) {
    userName.sendKeys(un);
    password.sendKeys(pwd);
}
public void clickLoginBtn() {
loginBtn.click();
}
}
