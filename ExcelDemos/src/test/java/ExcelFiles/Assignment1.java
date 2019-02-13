package ExcelFiles;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Assignment1 {
	
	
	public static int j = 0;
	WebDriver driver;
	  
  @Test
  public void logInCheck() throws IOException, InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://10.188.144.28:8083/TestMeApp/");
	  Thread.sleep(4000);
	  
	  File src = new File("C:\\Chandu\\User Data\\Credentials.xlsx");
	  FileInputStream fls = new FileInputStream(src);
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fls);
	  
	  XSSFSheet sh = wb.getSheet("Credentials");
	  
	  int rowCount = sh.getLastRowNum();
	  System.out.println("rowCount : "+rowCount);
	  
	  for(int i=0; i<=rowCount; i++) {
		  String UN = sh.getRow(i).getCell(0).getStringCellValue();
		  String PW = sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(UN+"\t\t"+PW); 
		  if(i==0) {
			  System.out.println("---------------------------");
		  }
		  TestLogIn.TestLogInMethod(driver, UN, PW);
	  }
	  System.out.println(j+" no. of users logged in sucessfully . . . !");
	  
	  Thread.sleep(2000);
	  
	  driver.quit();
  }
  
  
  /*public void openBrowser() throws InterruptedException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://10.188.144.28:8083/TestMeApp/");
	  Thread.sleep(4000);
  }
  
  
  public void afterMethod() {
	
	driver.quit();
	
  }*/

}
