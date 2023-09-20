package com.qa.Test;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.TheNorthFaceStoreLocator;

public class TheNorthFaceStoreLocator_test extends TestBase {

	TheNorthFaceStoreLocator locator;
	public TheNorthFaceStoreLocator_test() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup() throws IOException {

		initialization();
		locator = new TheNorthFaceStoreLocator(driver);
		driver.get(prop.getProperty("TheNorthFace"));

		}
		
		
	@Test (priority = 1) 
	public void VerifyHeaders_test() throws InterruptedException {
		locator.VerifyHeaders();
	}
	
	@Test(priority = 2)
	public void verifyFindstore_test() throws InterruptedException {
		locator.verifyFindstore();
	}
	
	@Test(priority =3)
	public void verifyFilters_test() throws Exception {
		locator.ApplyFilters();
	}
	
	 @Test(priority = 4)
	 public void VerifyFooterMenu() throws Exception {
		 locator.FooterOptions();
	 }
	 
//	@AfterClass
//	public void end() {
//	driver.quit();
//	}
	
}
