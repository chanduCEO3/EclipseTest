package POI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInTestCase {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://10.188.144.28:8083/TestMeApp/");
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	  
	  LoginPageRepository loginobj = new LoginPageRepository(driver);
	  
	  loginobj.typesignin();
	  loginobj.typeusername("Lalitha");
	  loginobj.typepassword("Password123");
	  loginobj.typelogin();
	  
	  driver.quit();
  }
}
