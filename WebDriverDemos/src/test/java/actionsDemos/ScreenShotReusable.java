package actionsDemos;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotReusable {
	
	public static void screenShotMethod(WebDriver driver, String Screenshot) throws IOException {
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File fs = ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(fs, new File("./Screenshots/"+timeStamp()+Screenshot+".png"));
	System.out.println("Screen Shot Taken ...!");
	
}
public static String timeStamp() {
	return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
}
}