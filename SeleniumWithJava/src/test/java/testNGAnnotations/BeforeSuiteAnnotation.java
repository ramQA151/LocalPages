package testNGAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeSuiteAnnotation {
	
	@BeforeSuite
	public void BeforeSuiteAnnotationMethod() {
		System.out.println("This method will run before all the tests and classes as this is defined at suite level");
	}
	
	@AfterSuite
	public void AfterSuiteAnnotationMethod() {
		System.out.println("This method will run after all the tests and classes as this is defined at suite level");
	}
}
