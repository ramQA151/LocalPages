package testNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {

	
	@BeforeTest
	public void BeforeTestMethodAnnotation(){
		System.out.println("This method will run first of all");	
		
	}
	@Test
	
	public void RegistationPage() {
		System.out.println("This is demo method for RegistationPage");
	}
	@Test
	public void SignInPage() {
		System.out.println("This is demo method for SignInPage");
	}
	
	@AfterTest
	public void AfterTestMethodAnnotation(){
		System.out.println("This method will run at last");	
		
	}
}
