package ExcelFiles;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class LoginCheckAllRowsxls {
	
	FileInputStream fls;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	WebDriver driver;
	
  @Test(dataProvider = "Sampledata")
public void logInCheck(String UN, String PW) throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://10.188.144.28:8083/TestMeApp/");
	  Thread.sleep(4000);
	  
	  driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(PW);
		driver.findElement(By.name("Login")).click();	
		Thread.sleep(5000);
		Assert.assertEquals("Home", driver.getTitle());	  
  }
  @AfterMethod
  public void Close() {
	  driver.close();
  }

  @DataProvider(name="Sampledata")
  public Object[][] TestData() throws IOException {
	  File src = new File("C:\\Chandu\\User Data\\Credentials.xlsx");
	  fls = new FileInputStream(src);
	  wb = new XSSFWorkbook(fls);
	  sh = wb.getSheet("Credentials");
	  int rowCount = sh.getLastRowNum();
	  
	  Object[][] data = new Object[rowCount+1][2];
	  
	  for(int i=0; i<=rowCount; i++) {
		  data[i][0] = sh.getRow(i).getCell(0).getStringCellValue();
		  data[i][1] = sh.getRow(i).getCell(1).getStringCellValue();
	  }
    return data;
    }
  }

