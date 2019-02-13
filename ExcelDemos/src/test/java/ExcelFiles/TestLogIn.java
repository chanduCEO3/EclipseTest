package ExcelFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogIn {
	
	public static void TestLogInMethod(WebDriver driver, String UN, String PW) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.188.144.28:8083/TestMeApp/");
		//Thread.sleep(4000);
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(PW);
		driver.findElement(By.name("Login")).click();
		String s = driver.getTitle();
		System.out.println(s);
		Thread.sleep(3000);
		
		if(s == "Login") {
			driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.partialLinkText("Out")).click();
			Thread.sleep(4000);			
			System.out.println(UN+" is unable to login to the application . . . !");			
		}
		/*else {
			driver.findElement(By.xpath("//a[contains(text(),'SignOut')])")).click();
			Thread.sleep(4000);
			System.out.println(UN+" is logged in succesfully . . . !");
			Assignment1.j++;
		}*/
		
		//driver.close();
	}

}
