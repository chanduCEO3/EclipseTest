package actionsDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MouseDemo1 {
  
	WebDriver ref; 
	
	@Test
  public void logInTestMeApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
		ref = new ChromeDriver();
		ref.get("http://10.188.144.28:8083/TestMeApp/");
		ref.manage().window().maximize();
		Thread.sleep(2000);
		ref.findElement(By.linkText("SignIn")).click();
		ref.findElement(By.name("userName")).sendKeys("Lalitha");
		ref.findElement(By.name("password")).sendKeys("Password123");
		ref.findElement(By.name("Login")).click();
		Thread.sleep(2000);
		//ref.close();
		
  }
}
