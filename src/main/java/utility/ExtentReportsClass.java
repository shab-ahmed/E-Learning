package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsClass {

	public static ExtentReports testReports(String fileName)
	{
		ExtentReports reports= new ExtentReports( );
		ExtentSparkReporter sparkReporter= new ExtentSparkReporter(fileName);
		reports.attachReporter(sparkReporter);
		//we can add additional information(multiple times) using setSystemInfo()
		reports.setSystemInfo("Created By", "Myself");
		return reports;
	}
}
