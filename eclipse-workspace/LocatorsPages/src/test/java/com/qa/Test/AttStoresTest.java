package com.qa.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Pages.AttStores;

public class AttStoresTest extends TestBase{
	AttStores AttStore;

	public AttStoresTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		AttStore = new AttStores(driver);
		driver.get(prop.getProperty("ATT"));

	}
	@Test (priority=2)
	public void VerifyHeading() throws Exception {
		AttStore.heading();
	}
	
	@Test(priority=1)
	public void VerifyFeedbackWindowClosed() throws Exception {
		
		AttStore.FbWindow();
	}
	
	@Test(priority=3)
	public void VerifyPaymentLink() throws Exception {
		AttStore.BillPayment();
	}
	
	@Test(priority=4)
	public void VerifyUpgradeDeviceLink() throws Exception {
		AttStore.UpgradingDevice();
	}
	
	@Test(priority=5)
	public void VerifyGetSupportPageLink() throws Exception {
		AttStore.GetSupport();
	}
	@Test (priority=6)
	public void VerifyATTPageLink() throws Exception {
		AttStore.GetMyAttApp();
	}
	@Test (priority=7)
	public void VerifyShopNowLink() throws Exception {
		AttStore.ShopNowBtn();
	}
	
	@Test (priority=8)
	public void VerifyOverviewSectionTime() throws Exception {
		AttStore.OverviewTabTime();
	}
	
	@Test (priority=9)
	public void VerifyOverviewSectionAddress() throws Exception {
		AttStore.OverviewTabAddress();
	}
	
	
	@Test (priority=10)
	public void VerifyOffersSectionTitle() throws Exception {
		AttStore.Offers();
	}
	

	@Test (priority=11)
	public void VerifyAboutSectnTitle() throws Exception {
		AttStore.About();
	}
	
	@Test (priority=12)
	public void VerifyFAQTitle() throws Exception {
		AttStore.FAQ();
	}
	
	@Test(priority=13)
	public void VerifyFAQQuestions() throws Exception {
		AttStore.NearbyLocations();
	}
	

	@Test(priority=14)
	public void VerifyAttServices() throws Exception {
		AttStore.AttServices();
	}

	@Test(priority=15)
	public void VerifyFooterServices() throws Exception {
		AttStore.FooterServices();
	}
	@Test (priority=16)
	public void VerifyOverviewSectionAddressOnMap() throws Exception {
		AttStore.OverviewTabAddressMap();
	}
	
}
