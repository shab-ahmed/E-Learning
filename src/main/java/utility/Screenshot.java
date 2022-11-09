package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void captureScreenshot(String name, WebDriver driver)
	{
		LocalDateTime dt= LocalDateTime.now();
		DateTimeFormatter format= DateTimeFormatter.ofPattern("DD-MM-YY HH_MM_SS");
		String myFormat= dt.format(format);
		
		File a= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File b= new File("D:\\Java Projects\\KhanAcademy\\screenshots\\"+name +"-" +myFormat +".png");
		try {
			FileHandler.copy(a, b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
