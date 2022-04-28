package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;
	private static ExtentSparkReporter spark;
	public static ExtentReports getInstance() {

		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/spark.html");
		extent.attachReporter(spark);
		return extent;
	}

	public static void flushExtentInstance() {
		extent.flush();		
	}


}
