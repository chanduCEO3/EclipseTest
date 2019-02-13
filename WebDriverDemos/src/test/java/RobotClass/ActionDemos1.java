package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionDemos1 {
  @Test
  public void ActionDemos() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.fb.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.id("email")).sendKeys("chandu");
	  driver.findElement(By.id("pass")).sendKeys("ceosecret");
	  Robot rb = new Robot();
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
  }
}
