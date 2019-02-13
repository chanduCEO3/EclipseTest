package actionsDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemos1 {
  
	WebDriver ref;
	
	
	
	@Test(priority=1)
  public void mouseActionsforAboutUs() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
		ref = new ChromeDriver();
		ref.get("http://10.188.144.28:8083/TestMeApp/");
		ref.manage().window().maximize();
		Thread.sleep(3000);
		WebElement aa = ref.findElement(By.xpath("//*[text()='AboutUs']"));
		WebElement of = ref.findElement(By.xpath("//*[text()='Our Offices']"));
		WebElement c = ref.findElement(By.xpath("//*[text()='Chennai']"));
		Actions act = new Actions(ref);
		act.moveToElement(aa).moveToElement(of).moveToElement(c).click().build().perform();
		Thread.sleep(3000);
		
  }
	
	@Test(priority=2)
	public void mouseActionsforAllCategories() throws InterruptedException {
		Actions act = new Actions(ref);
		WebElement ac = ref.findElement(By.xpath("//*[text()='All Categories']"));
		WebElement e = ref.findElement(By.xpath("//*[text()='Home Appliances']"));
		act.moveToElement(ac).moveToElement(e).click().build().perform();
		Thread.sleep(2000);
		WebElement ce = ref.findElement(By.xpath("//*[text()='Ceiling']"));
		act.moveToElement(ce).click().perform();
		Thread.sleep(3000);
		
		
	}
}
