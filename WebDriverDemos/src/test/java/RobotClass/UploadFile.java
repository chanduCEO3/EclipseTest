package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
  @Test
  public void f() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://uitestpractice.com/Students/Widgets");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.findElement(By.id("image_file")).click();
	  Robot robot = new Robot();
	  robot.setAutoDelay(2000);
	  
	  StringSelection ssel = new StringSelection("C:\\Chandu\\workBook\\WebDriverDemos\\Screenshots\\2019-38-11 15-38-41MainPage.png");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssel, null);
	  
	  robot.setAutoDelay(2000);
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_V);
	  
	  robot.setAutoDelay(3000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.setAutoDelay(2000);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  
  }
}
