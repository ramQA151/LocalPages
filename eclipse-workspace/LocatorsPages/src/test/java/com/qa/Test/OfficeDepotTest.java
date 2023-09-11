package com.qa.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.OfficeDepot;

public class OfficeDepotTest extends TestBase{
	OfficeDepot OffDept;

	public OfficeDepotTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		OffDept = new OfficeDepot(driver);
		driver.get(prop.getProperty("OfficeDepot"));

		
		}
	@Test
	public void VerifyHeading() throws Exception {
		OffDept.EnterZip();
	}
	@Test
	public void VerifyTotalLocations() throws Exception {
		OffDept.TotalLocations();
	}
	@Test
	public void VerifyTotalFilters() throws Exception {
		OffDept.TotalFilters();
	}
	
	@Test
	public void VerifyDirectionLink() throws Exception {
		OffDept.Direction();
	}
}
