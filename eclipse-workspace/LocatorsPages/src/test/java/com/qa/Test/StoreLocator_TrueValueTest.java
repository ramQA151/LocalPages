package com.qa.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.StoreLocator_TrueValue;

public class StoreLocator_TrueValueTest extends TestBase {

	StoreLocator_TrueValue storeLocator;

	public StoreLocator_TrueValueTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		storeLocator = new StoreLocator_TrueValue(driver);
		driver.get(prop.getProperty("TrueValueLocator"));

	}

	@Test(priority=1)
	public void VerifyOpenLocatorPage() throws Exception {
		storeLocator.SearchLocation();

	}

	@Test(priority=2)
	public void VerifyTextFrame() throws Exception {
		storeLocator.TextWindow();
	}

	@Test(priority=3)
	public void VerifyTotalAddresses() throws Exception {
		storeLocator.Address();
	}

	@Test(priority=4)
	public void VerifyEmailWindow() throws Exception {
		storeLocator.Email();
	}

	@Test(priority=5)
	public void VerifyDropdownForCountry() throws Exception {
		storeLocator.CountryDropdown();
	}

	@Test(priority=6)
	public void VerifyFilters() throws Exception {
		storeLocator.filterOptions();

	}

	@Test(priority=7)
	public void VerifyAddress() throws Exception {
		storeLocator.AddressVerify();

	}

	@Test(priority=8)
	public void VerifyStoreRedirect() throws Exception {
		storeLocator.RedirecttoStore();

	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.close();

	}
}
