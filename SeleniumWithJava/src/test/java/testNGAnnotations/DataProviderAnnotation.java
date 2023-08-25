package testNGAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {

	
	@Test(dataProvider="getData")
	public void LoginTest(String username , String password) {
		System.out.println("User logged in successfully: " +username + " and password: " +password);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data= new Object [3][2];
		data[0][0]= "Ram";
		data[0][1]= "1234";
		
		data[1][0] ="Vivek";
		data[1][1] = "5678";
		
		data[2][0] ="Narayan";
		data[2][1] ="9876";
		
		return data;
		
				
		
	}

}
