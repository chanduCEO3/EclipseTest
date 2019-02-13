package actionsDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class COntrolHoldFunctions {
	WebDriver driver;
	
  @Test
  public void controlHoldActions() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://uitestpractice.com/Students/Actions");
	  WebElement n1 = driver.findElement(By.name("one"));
	  WebElement n2 = driver.findElement(By.name("two"));
	  WebElement n3 = driver.findElement(By.name("seven"));
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.CONTROL).click().click(n1).click(n2).click(n3);
	  act.keyUp(Keys.CONTROL).perform();
  }
}
