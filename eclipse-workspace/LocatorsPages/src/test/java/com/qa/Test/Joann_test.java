package com.qa.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Pages.Joann;

public class Joann_test extends TestBase {

	Joann jn;

	public Joann_test() {
		super();

	}

	@BeforeClass
	public void setup() {
		initialization();
		jn = new Joann(driver);
		driver.get(prop.getProperty("joann"));

	}

	@Test (priority=1)
	public void verifySearchLocation() throws Exception {
		jn.searchLocation();
	}

	@Test (priority=2)
	public void verifyTotalStores() throws Exception {
		jn.allStores();
	}

	@Test(priority=3)
	public void verifyFilters() throws Exception {
		jn.filterOption();
	}

	@Test(priority=4)
	public void verifyStoreHours() throws Exception {
		jn.StoreDetailsBtn();
	}

	@Test(priority=5)
	public void verifyGetDirection() throws Exception {
		jn.getDirection();
	}

	@Test(priority=6)
	public void verifyMoreInfoLink() throws Exception {
		jn.MoreInfo();
	}

	@Test(priority=7)
	public void verifyWeeklyAddLink() throws Exception {
		jn.weeklyAdd();
	}

	@AfterClass
	public void TearDown() {
		driver.quit();
	}
}
