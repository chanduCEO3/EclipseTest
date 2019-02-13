package ExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadData {
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Chandu\\Selenium_Softwares\\Selenium_Softwares\\chromedriver.exe");
	  //WebDriver driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  //Thread.sleep(4000);
	  
	  File src = new File("C:\\Chandu\\User Data\\Credentials.xlsx");
	  FileInputStream fls = new FileInputStream(src);
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fls);
	  
	  XSSFSheet sh = wb.getSheet("Credentials");
	  
	  int rowCount = sh.getLastRowNum();
	  System.out.println("rowCount : "+rowCount);
	  
	  //int cellCount = sh.g
	  
	  //String data00 = sh.getRow(0).getCell(0).getStringCellValue();
	  //String data01 = sh.getRow(0).getCell(1).getStringCellValue();
	  //System.out.println(data00+"\t\t"+data01);
	  
	  for(int i=0; i<=rowCount; i++) {
		  String UN = sh.getRow(i).getCell(0).getStringCellValue();
		  String PW = sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(UN+"\t\t"+PW); 
		  if(i==0) {
			  System.out.println("---------------------------");
		  }
		  //TestLogIn.TestLogInMethod(UN, PW);
	  }
	  
	  wb.close();
	  
  }
}
