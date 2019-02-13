package actionsDemos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckJavaScript {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://uitestpractice.com/Students/Form");
	  Thread.sleep(2000);
	  
	 ((JavascriptExecutor)driver).executeScript("document.querySelectorAll('input[value=read]')[0].click()");
	  ((JavascriptExecutor)driver).executeScript("document.querySelectorAll('input[value=cricket]')[0].click()");
	  
	  Thread.sleep(3000);
	  
	  /*((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
	  Thread.sleep(3000);*/
  }
}
