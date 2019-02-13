package POI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageRepository {
	
	WebDriver driver;
	By username = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@value='Login']");
	By signin = By.xpath("//a[contains(text(),'SignIn')]");
	
	public LoginPageRepository(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeusername(String UN) {
		driver.findElement(username).sendKeys(UN);
	}
	
	public void typepassword(String PW) {
		driver.findElement(password).sendKeys(PW);
	}
	
	public void typelogin() {
		driver.findElement(login).click();
	}
	
	public void typesignin() {
		driver.findElement(signin).click();
	}
	
}
