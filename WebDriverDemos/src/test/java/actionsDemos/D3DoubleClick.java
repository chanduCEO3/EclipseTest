package actionsDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class D3DoubleClick {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.out.println("Hello");
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://uitestpractice.com/");
	  WebElement dc = driver.findElement(By.name("dblClick"));
	  Actions act =new Actions(driver);
	  act.doubleClick(dc).click().perform();
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
	  //WebElement drag = driver.findElement(By.id("draggable"));
	  //WebElement drop = driver.findElement(By.id("droppable"));
	  //act.clickAndHold(drag).perform();
	  //act.moveToElement(drop).click().build().perform();
	  //act.release(drop).perform();
	  Thread.sleep(5000);
	  driver.close();
  }
}
