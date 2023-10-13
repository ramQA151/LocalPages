package com.qa.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.OfficeDepot;

public class OfficeDepotTest extends TestBase{
	OfficeDepot OfficeDept;

	public OfficeDepotTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		OfficeDept = new OfficeDepot(driver);
		driver.get(prop.getProperty("OfficeDepot"));

		
		}
	@Test (priority=1)
	public void VerifyHeading() throws Exception {
		OfficeDept.EnterZip();
	}
	@Test(priority=2)
	public void VerifyTotalLocations() throws Exception {
		OfficeDept.TotalLocations();
	}
	@Test(priority=3)
	public void VerifyTotalFilters() throws Exception {
		OfficeDept.TotalFilters();
	}

	@Test(priority=4)
	public void VerifyTotalFilterNames() throws Exception {
		OfficeDept.TotalFilterNames();
	}
	
	@Test(priority=5)
	public void VerifyDirectionLink() throws Exception {
		OfficeDept.Direction();
	}

	@AfterClass
	public void Tearown() {
		driver.close();
	}
}
