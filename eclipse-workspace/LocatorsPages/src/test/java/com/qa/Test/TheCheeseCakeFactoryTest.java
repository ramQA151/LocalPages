package com.qa.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.TheCheeseCakeFactory;

public class TheCheeseCakeFactoryTest extends TestBase {
	TheCheeseCakeFactory ccf;

	public TheCheeseCakeFactoryTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		ccf = new TheCheeseCakeFactory(driver);
		driver.get(prop.getProperty("thecheesecakefactory"));

	}

	@Test(priority=1)
	public void VerifyHeaderMenu() throws Exception {
		ccf.headerMenu();

	}

	@Test(priority=2)
	public void VerifyLocation() throws Exception {
		ccf.Locations();
	}
	
//	@Test(priority=3)
//	public void VerifyReservationPage() throws Exception {
//		ccf.reservationPage();
//	}
	
	
	
//	@Test(priority=4)
//	public void VerifyOrderPickupPagetitle() throws Exception {
//		ccf.orderPickupPage();
//	}
	
//	@Test(priority=5)
//	public void VerifyOrderDeliveryPagetitle() throws Exception {
//		ccf.orderDeliveryPage();
//	}
	
	@Test(priority=6)
	public void VerifyOrderPickUp() throws Exception {
		ccf.OrderPickupOption();
	}
	
	@Test(priority=7)
	public void VerifyOrderDelivery() throws Exception {
		ccf.OrderDeliveryOption();
	}
	
//	@Test(priority=8)
//	public void VerifyRewardsPagetitle() throws Exception {
//		ccf.RewardsPage();
//	}
	
	@Test(priority=9)
	public void VerifyFooterMenu() throws Exception {
		ccf.FooterMenu();
	}
	
//	@AfterClass
//	public void tearDown() throws Exception {
//		driver.close();
//	}
}

