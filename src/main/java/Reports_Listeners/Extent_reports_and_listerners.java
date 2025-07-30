package Reports_Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_reports_and_listerners {
	
	
	public  ExtentReports Get_reports(){
		
		
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//Report_folder//report.html");
		
		spark.config().setReportName("[Project name]");
		spark.config().setDocumentTitle("[Doc_name]");
		
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(spark);
		report.setSystemInfo("Automated By", "Tester Name");
		
		return report;
		
		
	}
	
	
	

}
