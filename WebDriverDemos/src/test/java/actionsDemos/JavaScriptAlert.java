package actionsDemos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptAlert {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://10.188.144.28:8083/TestMeApp/");
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("alert('Welcome to Java Script Executor')");
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
	  
	  driver.get("http://demo.guru99.com/v4/");
	  
	  String domainName = js.executeScript("return document.domain;").toString();
	  System.out.println("Dmain name of the Site = "+domainName);
	  
	  String url = js.executeScript("return document.URL;").toString();
	  System.out.println("URL of the Site = "+url);
	  
	  
	  String titleName = js.executeScript("return document.title;").toString();
	  System.out.println("Title of the Pgae = "+titleName);
	  
	  Thread.sleep(10000);
	  
	  js.executeScript("window.location = 'http://10.188.144.28:8083/TestMeApp/'");
	  
	  
	  Thread.sleep(40000);
	  driver.quit();
  }
}
