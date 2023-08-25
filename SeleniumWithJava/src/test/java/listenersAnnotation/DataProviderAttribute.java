package listenersAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAttribute {

	@Test (dataProvider ="dp")
	
	public void TestLogin(String username, String password) {
		System.out.println("User has logged in using username: "+ username +" and password: " + password);
	}
	
	@DataProvider (name="dp")
	public Object[][] dataSupplierMethod(){
		
		Object [][] data= {{"Ram","134"},{"Narayan","589"}, {"Vivek","554"}};
		
		return data;
		
	}
}
