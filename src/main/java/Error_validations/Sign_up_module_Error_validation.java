package Error_validations;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.framework.testngtemplate.locators.Sign_up_locaters;
import com.framework.testngtemplate.pages.Base;
import com.framework.testngtemplate.pages.Fllelib;
public class Sign_up_module_Error_validation extends Base{
	
	
	@Test(dataProvider="signup_invalid_Datas")
	public void Invalid_Signup() throws IOException{
		
		Sign_up_locaters ss = new Sign_up_locaters(d);
        Fllelib f = new Fllelib();
		
		d.get(f.Data_reader("Signup_Page_url"));
		
		
		
		
		
		}
	
	@DataProvider
	public Object[][] signup_invalid_Datas(){
		
		
		return new Object[][]{{}};
		
		
		
	}
	
	
	
	

}
