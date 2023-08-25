package testNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class BeforeClassAnnotation {

@BeforeClass
	
	public void Setup() {
		System.out.println("Launching Browser and Opening Application url");
	}
	
	@AfterClass
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
