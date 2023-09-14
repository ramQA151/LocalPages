package com.qa.Pages;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.TestBase;

public class BenJerry_LocatorPage extends TestBase{
	 WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'Address or Postcode')]")
	WebElement Address;

	@FindBy(xpath = "//input[@id='inputaddress']")
	WebElement Address_TextField;

	@FindBy(xpath = "//select[@id='search_country']")
	WebElement CountryDropDown;

	@FindBy(xpath = "//input[@id='search_button']")
	WebElement SearchBtn;

	@FindBy(xpath = "//span[contains(text(),'Offers Catering')]")
	WebElement OffersCatering;

	@FindBy(xpath = "//input[@id='CATERING']")
	WebElement OffersCatering_Checkbox;

	@FindBy(xpath = "//span[contains(text(),'Offers Ice Cream Cakes')]")
	WebElement OffersIceCreamCakes;

	@FindBy(xpath = "//div[@id='CAKESFORSALE_Filter']//input[@id='CAKESFORSALE']")
	WebElement OffersIceCreamCakes_Checkbox;

	@FindBy(xpath = "//div[@id='CURBSIDE_Filter']//span[contains(text(),'Offers Take Out')]")
	WebElement OffersTakeOut;

	@FindBy(xpath = "//div[@id='CURBSIDE_Filter']//input[@id='CAKESFORSALE']")
	WebElement OffersTakeOut_Checkbox;

	@FindBy(xpath = "//input[@id='inputaddress']")
	WebElement Address_TextField1;

	@FindBy(xpath = "//input[@id='search_button']")
	WebElement SearchBtn1;

	@FindBy(xpath = "//div[@id='panel']//table[@id='collection_poi']//thead//tr[@class='poi']//th//p[@id='poiTitle']")
	WebElement FoundLocationCount;

	@FindBy(xpath = "//a[contains(text(),'Jack London Square')]")
	WebElement FirstStoreName;

	@FindBy(xpath = "//span[contains(text(),'510 663 3477')]")
	WebElement FirstStore_Contact;

	@FindBy(xpath = "/descendant::span[contains(text(),'Get Directions')][2]")
	WebElement FirstStore_Getdirection;

	@FindBy(xpath = "//div[@class='showLinkjacklondon']/descendant::span[contains(text(),'Scoop Shop Website')][1]")
	WebElement FirstStore_ScoopShopWebsite;

	@FindBy(xpath = "/descendant::a[contains(text(),'Order Take Out')][2]")
	WebElement FirstStore_OrderTakeOut;

	@FindBy(xpath = "/descendant::span[contains(text(),'Gift Cards Sold,')][3]")
	WebElement FirstStore_Offers;

	@FindBy(xpath = "/descendant::span[contains(text(),'Store Hours')][3]")
	WebElement FirstStore_StoreHours;

	@FindBy(xpath = "//a[contains(text(),'Jack London Square')]")
	WebElement FirstStoreName1;

	@FindBy(xpath = "//td[contains(text(),'Jack London Square')]")
	WebElement FirstStore;

	@FindBy(xpath = "/descendant::strong[contains(text(),'Get directions from:')][2]")
	WebElement Getdirection;

	@FindBy(xpath = "//div[@class='showLinkjacklondon']/descendant::span[contains(text(),'Scoop Shop Website')][1]")
	WebElement ScoopShopWebsite;

	@FindBy(xpath = "/descendant::div[@style='clear:both; width:100%;'][2]")
	WebElement offers;

	@FindBy(xpath = "/descendant::span[contains(text(),'Store Hours')][3]")
	WebElement StoreHours;

	@FindBy(xpath = "//div[@id='panel']//a[contains(text(),'Show All Locations')]")
	WebElement ShowAllLocations;

	@FindBy(xpath = "//div[@id='panel']//table[@id='collection_poi']//thead//tr[@class='poi']//th//p[@id='poiTitle']")
	WebElement FoundLocationCount1;

	@FindBy(xpath = "/descendant::span[contains(text(),'Get Directions')][2]")
	WebElement FirstStore_Getdirection1;

	@FindBy(xpath = "//td[contains(text(),'Jack London Square')]")
	WebElement FirstStore1;

	@FindBy(xpath = "/descendant::strong[contains(text(),'Get directions from:')][2]")
	WebElement Getdirection1;

	@FindBy(xpath = "//div[@class='showLinkjacklondon']/descendant::span[contains(text(),'Scoop Shop Website')][1]")
	WebElement ScoopShopWebsite1;

	@FindBy(xpath = "/descendant::div[@style='clear:both; width:100%;'][2]")
	WebElement Offers;

	@FindBy(xpath = "/descendant::span[contains(text(),'Store Hours')][3]")
	WebElement StoreHours1;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Monday')]")
	WebElement mon;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[2]")
	WebElement mon_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Tuesday')]")
	WebElement tue;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[4]")
	WebElement tue_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Wednesday')]")
	WebElement wed;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[6]")
	WebElement wed_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Thursday')]")
	WebElement thur;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[8]")
	WebElement thur_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Friday')]")
	WebElement fri;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[10]")
	WebElement fri_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Saturday')]")
	WebElement sat;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[12]")
	WebElement sat_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Sunday')]")
	WebElement sun;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[14]")
	WebElement sun_Timing;

	@FindBy(xpath = "//div[@id='panel']//a[contains(text(),'Show All Locations')]")
	WebElement ShowAllLocations1;

	@FindBy(xpath = "//div[@id='panel']//table[@id='collection_poi']//thead//tr[@class='poi']//th//p[@id='poiTitle']")
	WebElement FoundLocationCount2;

	@FindBy(xpath = "/descendant::span[contains(text(),'Store Hours')][3]")
	WebElement FirstStore_StoreHours1;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Monday')]")
	WebElement monday;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[2]")
	WebElement monday_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Tuesday')]")
	WebElement tuesday;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[4]")
	WebElement tuesday_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Wednesday')]")
	WebElement wednesday;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[6]")
	WebElement wednesday_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Thursday')]")
	WebElement thursday;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[8]")
	WebElement thursday_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Friday')]")
	WebElement friday;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[10]")
	WebElement friday_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Saturday')]")
	WebElement saturday;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[12]")
	WebElement saturday_Timing;

	@FindBy(xpath = "//div[@id='hours_section1']//div[contains(text(),'Sunday')]")
	WebElement sunday;

	@FindBy(xpath = "//tr[@class='even']//div[5]//div[2]//div[14]")
	WebElement sunday_Timing;

	@FindBy(xpath = "//span[contains(text(),'Hide Store Hours')]")
	WebElement HideStoreHours;

	@FindBy(xpath = "//div[@class='showLinkjacklondon']/descendant::span[contains(text(),'Scoop Shop Website')][1]")
	WebElement FirstStore_ScoopShopWebsite1;

	@FindBy(xpath = "/descendant::a[contains(text(),'Order Take Out')][2]")
	WebElement FirstStore_OrderTakeOut1;

	public BenJerry_LocatorPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void VerifyHomePage() throws InterruptedException {
		Assert.assertTrue(Address.isDisplayed());
		Assert.assertTrue(Address_TextField.isDisplayed());
		Assert.assertTrue(CountryDropDown.isDisplayed());
		Assert.assertTrue(SearchBtn.isDisplayed());
		Assert.assertTrue(OffersCatering.isDisplayed());
		Assert.assertTrue(OffersCatering_Checkbox.isDisplayed());
		Assert.assertTrue(OffersIceCreamCakes.isDisplayed());
		Assert.assertTrue(OffersIceCreamCakes_Checkbox.isDisplayed());
	}

	public void VerifySelectedAddress() throws InterruptedException {
		Address_TextField.click();
		Thread.sleep(1000);
		Address_TextField.sendKeys("Santa clara");
		Thread.sleep(1500);
		SearchBtn1.click();
		Thread.sleep(3500);
		System.out.println(FoundLocationCount.getText());
		Assert.assertTrue(FoundLocationCount.isDisplayed());
	}

	public void VerifyAllFoundLocations() throws InterruptedException {
		// 1
		System.out.println(FirstStoreName.getText());
		Assert.assertTrue(FirstStoreName.isDisplayed());
		System.out.println(FirstStore_Contact.getText());
		Assert.assertTrue(FirstStore_Contact.isDisplayed());
		System.out.println(FirstStore_Getdirection.getText());
		Assert.assertTrue(FirstStore_Getdirection.isDisplayed());
		System.out.println(FirstStore_ScoopShopWebsite.getText());
		Assert.assertTrue(FirstStore_ScoopShopWebsite.isDisplayed());
		System.out.println(FirstStore_OrderTakeOut.getText());
		Assert.assertTrue(FirstStore_OrderTakeOut.isDisplayed());
		System.out.println(FirstStore_Offers.getText());
		Assert.assertTrue(FirstStore_Offers.isDisplayed());
		System.out.println(FirstStore_StoreHours.getText());
		Assert.assertTrue(FirstStore_StoreHours.isDisplayed());
		System.out.println(" #### First Location is Verified Successfully ####");
	}

	public void VerifySelectedLocationDetails_StoreName() throws InterruptedException {

		FirstStoreName1.click();
		Thread.sleep(2000);
		System.out.println(FirstStore.getText());
		Assert.assertTrue(FirstStore.isDisplayed());
		System.out.println(Getdirection.getText());
		Assert.assertTrue(Getdirection.isDisplayed());
		System.out.println(ScoopShopWebsite.getText());
		Assert.assertTrue(ScoopShopWebsite.isDisplayed());
		System.out.println(offers.getText());
		Assert.assertTrue(offers.isDisplayed());
		System.out.println(StoreHours.getText());
		Assert.assertTrue(StoreHours.isDisplayed());
		System.out.println(" #### Selected Location is Verified Successfully ####");
		System.out.println(ShowAllLocations.getText());
		Assert.assertTrue(ShowAllLocations.isDisplayed());
		ShowAllLocations.click();
		Thread.sleep(2000);
		System.out.println(FoundLocationCount1.getText());
		Assert.assertTrue(FoundLocationCount1.isDisplayed());
		System.out.println("We are Redirected to All Store Locations page");

	}

	public void VerifySelectedLocationDetails_GetDirections() throws InterruptedException {
		Thread.sleep(1500);
		FirstStore_Getdirection1.click();
		Thread.sleep(2000);
		System.out.println(FirstStore1.getText());
		Assert.assertTrue(FirstStore1.isDisplayed());
		System.out.println(Getdirection1.getText());
		Assert.assertTrue(Getdirection1.isDisplayed());
		System.out.println(ScoopShopWebsite1.getText());
		Assert.assertTrue(ScoopShopWebsite1.isDisplayed());
		System.out.println(Offers.getText());
		Assert.assertTrue(Offers.isDisplayed());
		System.out.println(StoreHours.getText());
		Assert.assertTrue(StoreHours.isDisplayed());
		StoreHours.click();
		Thread.sleep(1500);
		Assert.assertTrue(mon.isDisplayed());
		Assert.assertTrue(mon_Timing.isDisplayed());
		Assert.assertTrue(tue.isDisplayed());
		Assert.assertTrue(tue_Timing.isDisplayed());
		Assert.assertTrue(wed.isDisplayed());
		Assert.assertTrue(wed_Timing.isDisplayed());
		Assert.assertTrue(thur.isDisplayed());
		Assert.assertTrue(thur_Timing.isDisplayed());
		Assert.assertTrue(fri.isDisplayed());
		Assert.assertTrue(fri_Timing.isDisplayed());
		Assert.assertTrue(sat.isDisplayed());
		Assert.assertTrue(sat_Timing.isDisplayed());
		Assert.assertTrue(sun.isDisplayed());
		Assert.assertTrue(sun_Timing.isDisplayed());
		System.out.println(" #### Selected Location is Verified Successfully ####");
		System.out.println(ShowAllLocations1.getText());
		Assert.assertTrue(ShowAllLocations1.isDisplayed());
		ShowAllLocations.click();
		Thread.sleep(2000);
		System.out.println(FoundLocationCount2.getText());
		Assert.assertTrue(FoundLocationCount2.isDisplayed());
		System.out.println("We are Redirected to All Store Locations page");
	}

	public void VerifySelectedLocationDetails_StoreHours() throws InterruptedException {
		Thread.sleep(1500);
		FirstStore_StoreHours1.click();
		Thread.sleep(1500);
		Assert.assertTrue(monday.isDisplayed());
		Assert.assertTrue(mon_Timing.isDisplayed());
		Assert.assertTrue(tue.isDisplayed());
		Assert.assertTrue(tue_Timing.isDisplayed());
		Assert.assertTrue(wed.isDisplayed());
		Assert.assertTrue(wed_Timing.isDisplayed());
		Assert.assertTrue(thur.isDisplayed());
		Assert.assertTrue(thur_Timing.isDisplayed());
		Assert.assertTrue(fri.isDisplayed());
		Assert.assertTrue(fri_Timing.isDisplayed());
		Assert.assertTrue(sat.isDisplayed());
		Assert.assertTrue(sat_Timing.isDisplayed());
		Assert.assertTrue(sun.isDisplayed());
		Assert.assertTrue(sun_Timing.isDisplayed());
		HideStoreHours.click();
		Thread.sleep(1500);
		System.out.println(" #### Store hours for Selected Location is Verified Successfully ####");
	}

	public void VerifySelectedLocationDetails_ScoopShopWebsite() throws InterruptedException {
		Thread.sleep(1500);
		FirstStore_ScoopShopWebsite1.click();
		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.benjerry.com/jacklondon");
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(3000);
		System.out.println(" #### Scoop Shop Website URL for Selected Location is Verified Successfully ####");
		Thread.sleep(3000);
		driver.quit();
	}

	public void VerifySelectedLocationDetails_OrderTakeOut() throws InterruptedException {

		FirstStore_OrderTakeOut1.click();
		Thread.sleep(3000);

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://benjerrytakeout.square.site/?location=11ea83ee20cbc440a2130cc47a2ae378");
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(3000);
		System.out.println(" #### Order TakeOut URL for Selected Location is Verified Successfully ####");
		driver.quit();
	}

}
