package com.qa.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.Michales;

public class MichalesTest extends TestBase{
	Michales Mic;

	public MichalesTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		Mic = new Michales(driver);
		driver.get(prop.getProperty("Michales"));

	}
	@Test(priority=1)
	public void VerifyLogo() {
	Mic.Logo();
}
		
	@Test(priority=2)
	public void VerifyAllLocations() throws Exception {
	Mic.AllLocations();
}
	@Test(priority=3)
	public void VerifyDDValues() throws Exception {
	Mic.DDBtn();
}

	@Test(priority=4)
	public void VerifyHeaderText() throws Exception {
	Mic.HeaderOptions();
}

	@Test(priority=5)
	public void VerifyServiceOptions() throws Exception {
	Mic.ServiceOptions();
}
	
	
}
