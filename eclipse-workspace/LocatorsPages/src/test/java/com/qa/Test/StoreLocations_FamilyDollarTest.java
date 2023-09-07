package com.qa.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.StoreLocations_FamilyDollar;

public class StoreLocations_FamilyDollarTest extends TestBase {
	
	StoreLocations_FamilyDollar StoreLocation;

	public StoreLocations_FamilyDollarTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		StoreLocation = new StoreLocations_FamilyDollar(driver);
		driver.get(prop.getProperty("FamilyDollar"));

	}
	
	@Test(priority=7)
	public void VerifyOpenLocatorPage() throws Exception {
		StoreLocation.postalAddress();
	}
	
	@Test(priority=5)
	public void VerifyListofAddress() throws Exception {
		StoreLocation.TotalAddress();
	}
	

	@Test(priority=1)
	public void VerifyTitalAminities() throws Exception {
		StoreLocation.TotalAminities();
	}
	
	@Test(priority=2)
	public void VerifyMoreInfoLink() throws Exception {
		StoreLocation.MoreInfoLink();
	}
	
	@Test (priority=3)
	public void VerifyWeeklyAddLink() throws Exception {
		StoreLocation.WeeklyAdd();
		}
	
	@Test
	public void VerifyFilterBtn() throws Exception {
		StoreLocation.Filter();
		}
	
	@Test(priority=4)
	public void VerifyFilterOptions() throws Exception {
		StoreLocation.FilterOptions();	
		}
	
	@Test(priority=8)
	public void VerifyClickingFilterOptions() throws Exception {
		StoreLocation.ClickingFilterOptions();	
		}
	
	@Test(priority=6)
	public void VerifyRerirectingtoMap() throws Exception {
		StoreLocation.MapDirection();
		}
}
