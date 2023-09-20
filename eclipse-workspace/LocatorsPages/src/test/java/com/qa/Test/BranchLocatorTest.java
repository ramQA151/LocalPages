package com.qa.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.BranchLocator;

public class BranchLocatorTest extends TestBase {

	BranchLocator bloc;

	public BranchLocatorTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		bloc = new BranchLocator(driver);
		driver.get(prop.getProperty("Branchlocator"));

	}

	
	@Test(priority=1)
	public void VerifyHeaderMenu() throws Exception {
		bloc.VerifyHeaderMenu();
	}
	@Test(priority=2)
	public void VerifyCityTextbox() throws Exception {
		bloc.EnterCity();
	}
	
	@Test(priority=3)
	public void VerifyTotalCities() throws Exception {
		bloc.TotalLocations();
	}
	
	@Test(priority=4)
	public void VerifyFilter() throws Exception {
		bloc.FilterOptions();
	}
	
	@Test(priority=5)
	public void VerifyEmailandPhone() throws Exception {
		bloc.verifyMailandPhone();
	}
	
	@AfterClass
	public void tearDown() throws Exception {
//		driver.close();

	}
}
