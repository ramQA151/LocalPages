package com.qa.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Pages.Dollertree;

public class DollerTreeTest extends TestBase {

	Dollertree dt;

	public DollerTreeTest() {
		super();

	}

	@BeforeClass
	public void setup() {
		initialization();
		dt = new Dollertree(driver);
		driver.get(prop.getProperty("dollertree"));

	}
	
	@Test (priority =1)
	public void VerifySearchlocation() throws InterruptedException {
		dt.Searchlocation();
	}
	
	@Test (priority =2)
	public void VerifyTotalStores() throws InterruptedException {
		dt.totalStores();
	}
	
	@Test (priority =3)
	public void VerifyTotalFilters() throws InterruptedException {
		dt.Searchradius();
	}
	
	@Test (priority =4)
	public void VerifyStoreDetails() throws InterruptedException {
		dt.StoreDetails();
	}
 
	@AfterClass
	public void TearDown() {
		// driver.quit();
	}
}
