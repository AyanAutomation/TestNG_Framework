package Error_validations;
import java.io.IOException;
import java.util.TreeMap;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.framework.testngtemplate.locators.Login_Locaters;
import com.framework.testngtemplate.pages.Base;
import com.framework.testngtemplate.pages.Fllelib;
import Reports_Listeners.ReportListeners;


@Listeners(Reports_Listeners.ReportListeners.class)
public class Loginpage_ErrorValidations extends Base{

	
	String Alert_Message;
	
	
	@Test(dataProvider="login_datas")
	void invalid_logging_in(TreeMap<String,String> values) throws IOException, InterruptedException{
		
		Login_Locaters l = new Login_Locaters(d);
		Fllelib f = new Fllelib();
		
		d.get(target_url);
		l.Login_button().click();
		l.Login_submit_button().click();
		Thread.sleep(800);
		Alert_Message=d.switchTo().alert().getText();
		ReportListeners.log_print_in_report().log(Status.INFO,Alert_Message);
		if(Alert_Message.contains("Please fill out Username and Password.")){
			ReportListeners.log_print_in_report().log(Status.INFO,"Testcase Passed Blank Validation for fields present");	
			d.switchTo().alert().accept();}
		l.login_id().sendKeys(values.get("id"));
		l.Login_submit_button().click();
		Thread.sleep(800);
		String idblankAlert_Message=d.switchTo().alert().getText();
		if(idblankAlert_Message.contains("Please fill out Username and Password.")){
			ReportListeners.log_print_in_report().log(Status.INFO,"Testcase Passed id Blank Validation error message "+idblankAlert_Message+" present");	
			d.switchTo().alert().accept();}
		l.login_id().clear();
		l.password_field().sendKeys(values.get("pass"));
		l.Login_submit_button().click();
		Thread.sleep(800);
		String password_blankAlert_Message=d.switchTo().alert().getText();
		if(password_blankAlert_Message.contains("Please fill out Username and Password.")){
			ReportListeners.log_print_in_report().log(Status.INFO,"Testcase Passed password Blank Validation error message "+password_blankAlert_Message+" present");	
			d.switchTo().alert().accept();}
		l.login_id().clear();
		l.password_field().clear();
		Thread.sleep(800);
		l.login_id().sendKeys(values.get("id"));
		l.password_field().sendKeys(values.get("pass"));
		l.Login_submit_button().click();
		Thread.sleep(800);
		try {
			ReportListeners.log_print_in_report().log(Status.INFO,"Error Thrown for wrong id or pass   "+d.switchTo().alert().getText());
			d.switchTo().alert().accept();
			Thread.sleep(800);
			}
		catch(Exception mk) {
			l.logout_button();
			ReportListeners.log_print_in_report().log(Status.INFO,"Error not Thrown for id --------->>>   "+values.get("id")+" and pass---------------->>>>    "+values.get("pass"));
			ReportListeners.log_print_in_report().log(Status.INFO,l.login_confirmation().getText());
		}}
	
	@DataProvider
	public Object[][] login_datas() throws IOException{
		
         Fllelib f = new Fllelib();
		
		TreeMap<String,String> lg1 = new TreeMap<String,String>();
		lg1.put("id", f.Data_reader("valid_id"));
		lg1.put("pass", "22355");
		TreeMap<String,String> lg2 = new TreeMap<String,String>();
		lg2.put("id", "aknnnb202@bm.com");
		lg2.put("pass", f.Data_reader("valid_pass"));
		TreeMap<String,String> lg3 = new TreeMap<String,String>();
		lg3.put("id", "aknnnb202@bm.com");
		lg3.put("pass", "4455m235");
		TreeMap<String,String> lg4 = new TreeMap<String,String>();
		lg4.put("id", f.Data_reader("valid_id"));
		lg4.put("pass", f.Data_reader("valid_pass"));
		
		return new Object[][] {{lg1},{lg2},{lg3},{lg4}};
		}
	
	
	
}
