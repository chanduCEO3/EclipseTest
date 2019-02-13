package actionsDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment1 {
  WebDriver driver;
  
	@Test
  public void assignment1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://10.188.144.28:8083/TestMeApp/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("SignIn")).click();
	  Thread.sleep(3000);
	  WebElement un = driver.findElement(By.id("userName"));
	  Actions act = new Actions(driver);
	  //act.keyDown(Keys.SHIFT).sendKeys(un, "lalitha").build().perform();
	  act.keyDown(un, Keys.SHIFT).sendKeys("LaliTha").keyDown(un, Keys.SHIFT).build().perform();
	  act.keyUp(Keys.SHIFT);
	  Thread.sleep(2000);
	  String gs = driver.findElement(By.id("userName")).getText();
	  System.out.println(gs);
	  
  }
}
