package testNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAnnotation {

	@BeforeMethod
	
	public void Setup() {
		System.out.println("Launching Browser and Opening Application url");
	}
	
	@AfterMethod
	
	public void Close() {
	System.out.println("Browser closed successfully");
	}
	
	@Test 
	public void Register() {
		System.out.println("Please Register and fill the mandatory fields");
	}
	@Test
	public void Login() {
		System.out.println("Please login with valid credentials");
	}
	@Test
	public void HomePage() {
		System.out.println("You have successfully landed on Homae page");
	}
}
