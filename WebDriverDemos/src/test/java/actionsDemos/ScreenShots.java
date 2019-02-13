package actionsDemos;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShots {
  WebDriver driver;
	@Test
  public void takingScreenShots() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://10.188.144.28:8083/TestMeApp/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  /*TakesScreenshot ts = (TakesScreenshot)driver;
	  File fs = ts.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(fs, new File("./Screenshots/TestMeAppImage.jpeg"));
	  Thread.sleep(2000);*/
	  ScreenShotReusable.screenShotMethod(driver, "MainPage");
	  driver.findElement(By.linkText("SignUp")).click();
	  Thread.sleep(2000);
	  ScreenShotReusable.screenShotMethod(driver, "Register");
	  driver.close();
  }
}
