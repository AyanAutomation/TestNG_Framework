package Error_validations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.framework.testngtemplate.locators.Login_Locaters;
import com.framework.testngtemplate.pages.Base;
import com.framework.testngtemplate.pages.Fllelib;

public class Loginpage_ErrorValidations extends Base{

	
	@Test(dataProvider="login_datas")
	void invalid_logging_in(String id , String Password) throws IOException{
		
		Login_Locaters l = new Login_Locaters(d);
		Fllelib f = new Fllelib();
		
		d.get(f.Data_reader("login_url"));
		
		
		
		
		}
	
	@DataProvider
	public Object[][] login_datas() throws IOException{
		
		Fllelib f = new Fllelib();
		
		return new Object[][]{{"",""},{"",f.Data_reader("")},{f.Data_reader(""),""}};
		}
	
	
	
}
