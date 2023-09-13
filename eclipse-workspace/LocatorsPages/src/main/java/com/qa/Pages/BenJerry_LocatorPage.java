package com.qa.Pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BenJerry_LocatorPage {
	 WebDriver driver;

	 @FindBy(xpath="//span[contains(text(),'Address or Postcode')]")
	 WebElement Address;
	 
	 @FindBy(xpath="//input[@id='inputaddress']")
	 WebElement Address_TextField;
	 
	 @FindBy(xpath="//select[@id='search_country']")
	 WebElement CountryDropDown ;
	 
	 @FindBy(xpath="//input[@id='search_button']")
	 WebElement SearchBtn;
	 
	 @FindBy(xpath="//span[contains(text(),'Offers Catering')]")
	 WebElement OffersCatering;
	 
	 @FindBy(xpath="//input[@id='CATERING']")
	 WebElement OffersCatering_Checkbox;
	 
	 @FindBy(xpath="//span[contains(text(),'Offers Ice Cream Cakes')]\"")
	 WebElement OffersIceCreamCakes;
	 
	 @FindBy(xpath="//div[@id='CAKESFORSALE_Filter']//input[@id='CAKESFORSALE']")
	 WebElement OffersIceCreamCakes_Checkbox;
	 
	 @FindBy(xpath="//div[@id='CURBSIDE_Filter']//span[contains(text(),'Offers Take Out')]")
	 WebElement OffersTakeOut;
	 
	 @FindBy(xpath="//div[@id='CURBSIDE_Filter']//input[@id='CAKESFORSALE']")
	 WebElement OffersTakeOut_Checkbox;
	 
	 @FindBy(xpath="//input[@id='inputaddress']")
	 WebElement Address_TextField1;
	 
	 @FindBy(xpath="//input[@id='search_button']")
	 WebElement SearchBtn1;
	 
	 @FindBy(xpath="//div[@id='panel']//table[@id='collection_poi']//thead//tr[@class='poi']//th//p[@id='poiTitle']")
	 WebElement FoundLocationCount;
	 
	 @FindBy(xpath="//a[contains(text(),'Jack London Square')]")
	 WebElement FirstStoreName;
	 
	 @FindBy(xpath="//span[contains(text(),'510 663 3477')]")
	 WebElement FirstStore_Contact;
	 
	
	 
	 
	public BenJerry_LocatorPage(WebDriver driver) {
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
		Assert.assertTrue(OffersTakeOut.isDisplayed());
		Assert.assertTrue(OffersTakeOut_Checkbox.isDisplayed());
	}

	public void VerifySelectedAddress() throws InterruptedException {
		Address_TextField1.click();
		Thread.sleep(1000);
		Address_TextField1.sendKeys("Santa clara");
		Thread.sleep(1500);
		SearchBtn1.click();
		Thread.sleep(3500);
		System.out.println(FoundLocationCount.getText());
		Assert.assertTrue(FoundLocationCount.isDisplayed());
	}

	public void VerifyAllFoundLocations() throws InterruptedException {
		
		
		System.out.println(FirstStoreName.getText());
		Assert.assertTrue(FirstStoreName.isDisplayed());
		/*
		 * WebElement FirstStore_Add1 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[1]"
		 * )); System.out.println(FirstStore_Add1.getText());
		 * Assert.assertTrue(FirstStore_Add1.isDisplayed()); WebElement FirstStore_Add2
		 * = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[2]"
		 * )); System.out.println(FirstStore_Add2.getText());
		 * Assert.assertTrue(FirstStore_Add2.isDisplayed());
		 */
		System.out.println(FirstStore_Contact.getText());
		Assert.assertTrue(FirstStore_Contact.isDisplayed());
		WebElement FirstStore_Getdirection = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Get Directions')][2]"));
		System.out.println(FirstStore_Getdirection.getText());
		Assert.assertTrue(FirstStore_Getdirection.isDisplayed());
		WebElement FirstStore_ScoopShopWebsite = driver.findElement(By.xpath(
				"//div[@class='showLinkjacklondon']/descendant::span[contains(text(),'Scoop Shop Website')][1]"));
		System.out.println(FirstStore_ScoopShopWebsite.getText());
		Assert.assertTrue(FirstStore_ScoopShopWebsite.isDisplayed());
		WebElement FirstStore_OrderTakeOut = driver
				.findElement(By.xpath("/descendant::a[contains(text(),'Order Take Out')][2]"));
		System.out.println(FirstStore_OrderTakeOut.getText());
		Assert.assertTrue(FirstStore_OrderTakeOut.isDisplayed());
		WebElement FirstStore_Offers = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Gift Cards Sold,')][3]"));
		System.out.println(FirstStore_Offers.getText());
		Assert.assertTrue(FirstStore_Offers.isDisplayed());
		WebElement FirstStore_StoreHours = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][3]"));
		System.out.println(FirstStore_StoreHours.getText());
		Assert.assertTrue(FirstStore_StoreHours.isDisplayed());
		System.out.println(" #### First Location is Verified Successfully ####");
	}
	
		/*		 * //2 WebElement SecondStoreName =
		 * driver.findElement(By.xpath("//a[contains(text(),\"Macy's\")]"));
		 * System.out.println(SecondStoreName.getText());
		 * Assert.assertTrue(SecondStoreName.isDisplayed()); /*WebElement
		 * SecondStoreName_Add1 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[1]"
		 * )); System.out.println(SecondStoreName_Add1.getText());
		 * Assert.assertTrue(SecondStoreName_Add1.isDisplayed()); WebElement
		 * SecondStoreName_Add2 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[2]"
		 * )); System.out.println(SecondStoreName_Add2.getText());
		 * Assert.assertTrue(SecondStoreName_Add2.isDisplayed()); WebElement
		 * SecondStoreName_Contact =
		 * driver.findElement(By.xpath("//span[contains(text(),'415 263 7239')]"));
		 * System.out.println(SecondStoreName_Contact.getText());
		 * Assert.assertTrue(SecondStoreName_Contact.isDisplayed()); WebElement
		 * SecondStoreName_Getdirection = driver.findElement(By.
		 * xpath("/descendant::span[contains(text(),'Get Directions')][3]"));
		 * System.out.println(SecondStoreName_Getdirection.getText());
		 * Assert.assertTrue(SecondStoreName_Getdirection.isDisplayed()); WebElement
		 * SecondStoreName_ScoopShopWebsite = driver.findElement(By.
		 * xpath("//div[@class='showLinkmacys']/descendant::span[contains(text(),'Scoop Shop Website')][1]"
		 * )); System.out.println(SecondStoreName_ScoopShopWebsite.getText());
		 * Assert.assertTrue(SecondStoreName_ScoopShopWebsite.isDisplayed()); WebElement
		 * SecondStoreName_OrderTakeOut = driver.findElement(By.
		 * xpath("/descendant::a[contains(text(),'Order Take Out')][2]"));
		 * System.out.println(SecondStoreName_OrderTakeOut.getText());
		 * Assert.assertTrue(SecondStoreName_OrderTakeOut.isDisplayed()); WebElement
		 * SecondStoreName_Offers = driver.findElement(By.
		 * xpath("/descendant::span[contains(text(),'Gift Cards Sold,')][4]"));
		 * System.out.println(SecondStoreName_Offers.getText());
		 * Assert.assertTrue(SecondStoreName_Offers.isDisplayed()); WebElement
		 * SecondStoreName_StoreHours = driver.findElement(By.
		 * xpath("/descendant::span[contains(text(),'Store Hours')][4]"));
		 * System.out.println(SecondStoreName_StoreHours.getText());
		 * Assert.assertTrue(SecondStoreName_StoreHours.isDisplayed());
		 * System.out.println(" #### Second Location is Verified Successfully ####");
		 

		// 3
		WebElement ThirdStoreName = driver.findElement(By.xpath("//a[contains(text(),'Haight Ashbury')]"));
		System.out.println(ThirdStoreName.getText());
		Assert.assertTrue(ThirdStoreName.isDisplayed());
		/*
		 * WebElement ThirdStoreName_Add1 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[1]"
		 * )); System.out.println(ThirdStoreName_Add1.getText());
		 * Assert.assertTrue(ThirdStoreName_Add1.isDisplayed()); WebElement
		 * ThirdStoreName_Add2 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[2]"
		 * )); System.out.println(ThirdStoreName_Add2.getText());
		 * Assert.assertTrue(ThirdStoreName_Add2.isDisplayed());
		 
		WebElement ThirdStoreName_Contact = driver.findElement(By.xpath("//span[contains(text(),'415 626 4143')]"));
		System.out.println(ThirdStoreName_Contact.getText());
		Assert.assertTrue(ThirdStoreName_Contact.isDisplayed());
		WebElement ThirdStoreName_Getdirection = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Get Directions')][4]"));
		System.out.println(ThirdStoreName_Getdirection.getText());
		Assert.assertTrue(ThirdStoreName_Getdirection.isDisplayed());
		WebElement ThirdStoreName_ScoopShopWebsite = driver.findElement(By.xpath(
				"//div[@class='showLinkhaightashbury']/descendant::span[contains(text(),'Scoop Shop Website')][1]"));
		System.out.println(ThirdStoreName_ScoopShopWebsite.getText());
		Assert.assertTrue(ThirdStoreName_ScoopShopWebsite.isDisplayed());
		
		 * WebElement ThirdStoreName_OrderTakeOut = driver.findElement(By.
		 * xpath("/descendant::a[contains(text(),'Order Take Out')][2]"));
		 * System.out.println(ThirdStoreName_OrderTakeOut.getText());
		 * Assert.assertTrue(ThirdStoreName_OrderTakeOut.isDisplayed());
		 
		WebElement ThirdStoreName_Offers = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Gift Cards Sold,')][5]"));
		System.out.println(ThirdStoreName_Offers.getText());
		//Assert.assertTrue(ThirdStoreName_Offers.isDisplayed());
		WebElement ThirdStoreName_StoreHours = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][5]"));
		System.out.println(ThirdStoreName_StoreHours.getText());
		//Assert.assertTrue(ThirdStoreName_StoreHours.isDisplayed());
		System.out.println(" #### Third Location is Verified Successfully ####");

		// 4
		WebElement FourthStoreName = driver.findElement(By.xpath("//a[contains(text(),'Berkeley - Center Street')]"));
		System.out.println(FourthStoreName.getText());
		Assert.assertTrue(FourthStoreName.isDisplayed());
		
		 * WebElement ThirdStoreName_Add1 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[1]"
		 * )); System.out.println(ThirdStoreName_Add1.getText());
		 * Assert.assertTrue(ThirdStoreName_Add1.isDisplayed()); WebElement
		 * ThirdStoreName_Add2 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[2]"
		 * )); System.out.println(ThirdStoreName_Add2.getText());
		 * Assert.assertTrue(ThirdStoreName_Add2.isDisplayed());
		
		WebElement FourthStoreName_Contact = driver.findElement(By.xpath("//span[contains(text(),'510 900 2460')]"));
		System.out.println(FourthStoreName_Contact.getText());
		Assert.assertTrue(FourthStoreName_Contact.isDisplayed());
		WebElement FourthStoreName_Getdirection = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Get Directions')][5]"));
		System.out.println(FourthStoreName_Getdirection.getText());
		Assert.assertTrue(FourthStoreName_Getdirection.isDisplayed());
		WebElement FourthStoreName_ScoopShopWebsite = driver.findElement(By
				.xpath("//div[@class='showLinkberkeley']/descendant::span[contains(text(),'Scoop Shop Website')][1]"));
		System.out.println(FourthStoreName_ScoopShopWebsite.getText());
		Assert.assertTrue(FourthStoreName_ScoopShopWebsite.isDisplayed());
		WebElement FourthStoreName_OrderTakeOut = driver
				.findElement(By.xpath("/descendant::a[contains(text(),'Order Take Out')][5]"));
		System.out.println(FourthStoreName_OrderTakeOut.getText());
		Assert.assertTrue(FourthStoreName_OrderTakeOut.isDisplayed());
		WebElement FourthStoreName_Offers = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Gift Cards Sold,')][6]"));
		System.out.println(FourthStoreName_Offers.getText());
		Assert.assertTrue(FourthStoreName_Offers.isDisplayed());
		WebElement FourthStoreName_StoreHours = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][6]"));
		System.out.println(FourthStoreName_StoreHours.getText());
		Assert.assertTrue(FourthStoreName_StoreHours.isDisplayed());
		System.out.println(" #### Fourth Location is Verified Successfully ####");

		Boolean NextBtn = driver.findElement(By.xpath("/descendant::a[@msgid='Next'][contains(text(),'Next')][2]"))
				.isDisplayed();
		Thread.sleep(1000);
		if (NextBtn == true) {
			WebElement NextPageBtn = driver
					.findElement(By.xpath("/descendant::a[@msgid='Next'][contains(text(),'Next')][2]"));
			NextPageBtn.click();
			Thread.sleep(3500);
			WebElement PreviousPageBtn = driver.findElement(By.xpath("/descendant::a[contains(text(),'Previous')][2]"));
			Assert.assertTrue(PreviousPageBtn.isDisplayed());
			System.out.println("***The Page is successfully redirected to Next Page***");
		} else {
			System.out.println("The Next button is not Displyed on the Page");
		}
		Thread.sleep(1000); 

		// 5
		WebElement FifthStoreName = driver.findElement(By.xpath("//a[contains(text(),\"Fisherman's Wharf\")]"));
		System.out.println(FifthStoreName.getText());
		Assert.assertTrue(FifthStoreName.isDisplayed());
		/*
		 * WebElement FifthStoreName_Add1 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[1]"
		 * )); System.out.println(FifthStoreName_Add1.getText());
		 * Assert.assertTrue(FifthStoreName_Add1.isDisplayed()); WebElement
		 * FifthStoreName_Add2 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[2]"
		 * )); System.out.println(FifthStoreName_Add2.getText());
		 * Assert.assertTrue(FifthStoreNamee_Add2.isDisplayed());
		 
		WebElement FifthStoreName_Contact = driver.findElement(By.xpath("//span[contains(text(),'415 249 2656')]"));
		System.out.println(FifthStoreName_Contact.getText());
		Assert.assertTrue(FifthStoreName_Contact.isDisplayed());
		WebElement FifthStoreName_Getdirection = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Get Directions')][2]"));
		System.out.println(FifthStoreName_Getdirection.getText());
		Assert.assertTrue(FifthStoreName_Getdirection.isDisplayed());
		WebElement FifthStoreName_ScoopShopWebsite = driver.findElement(By.xpath(
				"//div[@class='showLinkfishermanswharf']/descendant::span[contains(text(),'Scoop Shop Website')][1]"));
		System.out.println(FifthStoreName_ScoopShopWebsite.getText());
		Assert.assertTrue(FifthStoreName_ScoopShopWebsite.isDisplayed());
		WebElement FifthStoreName_OrderTakeOut = driver
				.findElement(By.xpath("/descendant::a[contains(text(),'Order Take Out')][2]"));
		System.out.println(FifthStoreName_OrderTakeOut.getText());
		Assert.assertTrue(FifthStoreName_OrderTakeOut.isDisplayed());
		WebElement FifthStoreName_Offers = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Gift Cards Sold,')][3]"));
		System.out.println(FifthStoreName_Offers.getText());
		Assert.assertTrue(FifthStoreName_Offers.isDisplayed());
		WebElement FifthStoreName_StoreHours = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][3]"));
		System.out.println(FifthStoreName_StoreHours.getText());
		Assert.assertTrue(FifthStoreName_StoreHours.isDisplayed());
		System.out.println(" #### FifthStoreName Location is Verified Successfully ####"); 
		 
		// 6
		
		 * WebElement SixthStoreName =
		 * driver.findElement(By.xpath("//a[contains(text(),'Argonaut')]"));
		 * System.out.println(SixthStoreName.getText());
		 * Assert.assertTrue(SixthStoreName.isDisplayed());
		 * 
		 * WebElement SixthStoreName_Add1 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[1]"
		 * )); System.out.println(SixthStoreName_Add1.getText());
		 * Assert.assertTrue(SixthStoreName_Add1.isDisplayed()); WebElement
		 * SixthStoreName_Add2 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[2]"
		 * )); System.out.println(SixthStoreName_Add2.getText());
		 * Assert.assertTrue(SixthStoreName_Add2.isDisplayed());
		 * 
		 * WebElement SixthStoreName_Contact =
		 * driver.findElement(By.xpath("//span[contains(text(),'415 567 5873')]"));
		 * System.out.println(SixthStoreName_Contact.getText());
		 * Assert.assertTrue(SixthStoreName_Contact.isDisplayed()); WebElement
		 * SixthStoreName_Getdirection = driver .findElement(By.
		 * xpath("/descendant::span[contains(text(),'Get Directions')][3]"));
		 * System.out.println(SixthStoreName_Getdirection.getText());
		 * Assert.assertTrue(SixthStoreName_Getdirection.isDisplayed()); WebElement
		 * SixthStoreName_ScoopShopWebsite = driver.findElement(By
		 * .xpath("//div[@class='showLinkargonaut']/descendant::span[contains(text(),'Scoop Shop Website')][1]"
		 * )); System.out.println(SixthStoreName_ScoopShopWebsite.getText());
		 * Assert.assertTrue(SixthStoreName_ScoopShopWebsite.isDisplayed());
		 * 
		 * WebElement SixthStoreName_OrderTakeOut = driver.findElement(By.
		 * xpath("/descendant::a[contains(text(),'Order Take Out')][2]"));
		 * System.out.println(SixthStoreName_OrderTakeOut.getText());
		 * Assert.assertTrue(SixthStoreName_OrderTakeOut.isDisplayed());
		 * 
		 * WebElement SixthStoreName_Offers = driver .findElement(By.
		 * xpath("/descendant::span[contains(text(),'Gift Cards Sold,')][4]"));
		 * System.out.println(SixthStoreName_Offers.getText());
		 * Assert.assertTrue(SixthStoreName_Offers.isDisplayed()); WebElement
		 * SixthStoreName_StoreHours = driver
		 * .findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][4]")
		 * ); System.out.println(SixthStoreName_StoreHours.getText());
		 * Assert.assertTrue(SixthStoreName_StoreHours.isDisplayed()); System.out.
		 * println(" #### SixthStoreName Location is Verified Successfully ####");
		 

		// 7
		WebElement SeventhStoreName = driver
				.findElement(By.xpath("//a[contains(text(),'San Francisco Bay Area Ice Cream Catering')]"));
		System.out.println(SeventhStoreName.getText());
		Assert.assertTrue(SeventhStoreName.isDisplayed());
		
		 * WebElement SeventhStoreName_Add1 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[1]"
		 * )); System.out.println(SeventhStoreName_Add1.getText());
		 * Assert.assertTrue(SeventhStoreName_Add1.isDisplayed()); WebElement
		 * SeventhStoreName_Add2 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[2]"
		 * )); System.out.println(SeventhStoreName_Add2.getText());
		 * Assert.assertTrue(SeventhStoreName_Add2.isDisplayed());
		 
		WebElement SeventhStoreName_Contact = driver.findElement(By.xpath("//span[contains(text(),'415 249 4670')]"));
		System.out.println(SeventhStoreName_Contact.getText());
		Assert.assertTrue(SeventhStoreName_Contact.isDisplayed());
		WebElement SeventhStoreName_Getdirection = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Get Directions')][4]"));
		System.out.println(SeventhStoreName_Getdirection.getText());
		Assert.assertTrue(SeventhStoreName_Getdirection.isDisplayed());
		WebElement SeventhStoreName_ScoopShopWebsite = driver.findElement(By.xpath(
				"//div[@class='showLinkbayareaicecreamcatering']/descendant::span[contains(text(),'Scoop Shop Website')][1]"));
		System.out.println(SeventhStoreName_ScoopShopWebsite.getText());
		Assert.assertTrue(SeventhStoreName_ScoopShopWebsite.isDisplayed());
		
		 * WebElement SeventhStoreName_OrderTakeOut = driver.findElement(By.
		 * xpath("/descendant::a[contains(text(),'Order Take Out')][2]"));
		 * System.out.println(SeventhStoreName_OrderTakeOut.getText());
		 * Assert.assertTrue(SeventhStoreName_OrderTakeOut.isDisplayed());
		 
		WebElement SeventhStoreName_Offers = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Catering,')][5]"));
		System.out.println(SeventhStoreName_Offers.getText());
		Assert.assertTrue(SeventhStoreName_Offers.isDisplayed());
		WebElement SeventhStoreName_StoreHours = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][5]"));
		System.out.println(SeventhStoreName_StoreHours.getText());
		Assert.assertTrue(SeventhStoreName_StoreHours.isDisplayed());
		System.out.println(" #### SeventhStoreName Location is Verified Successfully ####");

		Boolean PreviousBtn = driver.findElement(By.xpath("/descendant::a[contains(text(),'Previous')][2]"))
				.isDisplayed();
		Thread.sleep(1000);
		if (PreviousBtn == true) {
			WebElement PreviousPageBtn = driver.findElement(By.xpath("/descendant::a[contains(text(),'Previous')][2]"));
			PreviousPageBtn.click();
			Thread.sleep(3500);
			WebElement NextPageBtn = driver
					.findElement(By.xpath("/descendant::a[@msgid='Next'][contains(text(),'Next')][2]"));
			Assert.assertTrue(NextPageBtn.isDisplayed());
			System.out.println("***The Page is successfully redirected to Previous Page***");
		} else {
			System.out.println("The Previous button is not Displyed on the Page");
		}
		Thread.sleep(1000);
	}*/

	public void VerifySelectedLocationDetails_StoreName() throws InterruptedException {

		WebElement FirstStoreName = driver.findElement(By.xpath("//a[contains(text(),'Jack London Square')]"));
		FirstStoreName.click();
		Thread.sleep(2000);
		WebElement FirstStore = driver.findElement(By.xpath("//td[contains(text(),'Jack London Square')]"));
		System.out.println(FirstStore.getText());
		Assert.assertTrue(FirstStore.isDisplayed());

		/*
		 * WebElement FirstStore_Add1 = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[1]"
		 * )); System.out.println(FirstStore_Add1.getText());
		 * Assert.assertTrue(FirstStore_Add1.isDisplayed()); WebElement FirstStore_Add2
		 * = driver.findElement(By.
		 * xpath("//td//a[contains(text(),'Jack London Square')]/following-sibling::br[2]"
		 * )); System.out.println(FirstStore_Add2.getText());
		 * Assert.assertTrue(FirstStore_Add2.isDisplayed()); WebElement
		 * FirstStore_Contact =
		 * driver.findElement(By.xpath("//span[contains(text(),'510 663 3477')]"));
		 * System.out.println(FirstStore_Contact.getText());
		 * Assert.assertTrue(FirstStore_Contact.isDisplayed());
		 */
		WebElement Getdirection = driver
				.findElement(By.xpath("/descendant::strong[contains(text(),'Get directions from:')][2]"));
		System.out.println(Getdirection.getText());
		Assert.assertTrue(Getdirection.isDisplayed());
		WebElement ScoopShopWebsite = driver.findElement(By.xpath(
				"//div[@class='showLinkjacklondon']/descendant::span[contains(text(),'Scoop Shop Website')][1]"));
		System.out.println(ScoopShopWebsite.getText());
		Assert.assertTrue(ScoopShopWebsite.isDisplayed());
		WebElement Offers = driver.findElement(By.xpath("/descendant::div[@style='clear:both; width:100%;'][2]"));
		System.out.println(Offers.getText());
		Assert.assertTrue(Offers.isDisplayed());
		WebElement StoreHours = driver.findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][3]"));
		System.out.println(StoreHours.getText());
		Assert.assertTrue(StoreHours.isDisplayed());
		System.out.println(" #### Selected Location is Verified Successfully ####");

		WebElement ShowAllLocations = driver
				.findElement(By.xpath("//div[@id='panel']//a[contains(text(),'Show All Locations')]"));
		System.out.println(ShowAllLocations.getText());
		Assert.assertTrue(ShowAllLocations.isDisplayed());
		ShowAllLocations.click();
		Thread.sleep(2000);
		WebElement FoundLocationCount = driver.findElement(By.xpath(
				"//div[@id='panel']//table[@id='collection_poi']//thead//tr[@class='poi']//th//p[@id='poiTitle']"));
		System.out.println(FoundLocationCount.getText());
		Assert.assertTrue(FoundLocationCount.isDisplayed());
		System.out.println("We are Redirected to All Store Locations page");

	}

	public void VerifySelectedLocationDetails_GetDirections() throws InterruptedException {
		Thread.sleep(1500);
		WebElement FirstStore_Getdirection = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Get Directions')][2]"));
		FirstStore_Getdirection.click();
		Thread.sleep(2000);

		WebElement FirstStore = driver.findElement(By.xpath("//td[contains(text(),'Jack London Square')]"));
		System.out.println(FirstStore.getText());
		Assert.assertTrue(FirstStore.isDisplayed());
		WebElement Getdirection = driver
				.findElement(By.xpath("/descendant::strong[contains(text(),'Get directions from:')][2]"));
		System.out.println(Getdirection.getText());
		Assert.assertTrue(Getdirection.isDisplayed());
		WebElement ScoopShopWebsite = driver.findElement(By.xpath(
				"//div[@class='showLinkjacklondon']/descendant::span[contains(text(),'Scoop Shop Website')][1]"));
		System.out.println(ScoopShopWebsite.getText());
		Assert.assertTrue(ScoopShopWebsite.isDisplayed());
		WebElement Offers = driver.findElement(By.xpath("/descendant::div[@style='clear:both; width:100%;'][2]"));
		System.out.println(Offers.getText());
		Assert.assertTrue(Offers.isDisplayed());
		WebElement StoreHours = driver.findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][3]"));
		System.out.println(StoreHours.getText());
		Assert.assertTrue(StoreHours.isDisplayed());
		StoreHours.click();
		Thread.sleep(1500);

		WebElement mon = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Monday')]"));
		Assert.assertTrue(mon.isDisplayed());
		WebElement mon_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[2]"));
		Assert.assertTrue(mon_Timing.isDisplayed());

		WebElement tue = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Tuesday')]"));
		Assert.assertTrue(tue.isDisplayed());
		WebElement tue_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[4]"));
		Assert.assertTrue(tue_Timing.isDisplayed());

		WebElement wed = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Wednesday')]"));
		Assert.assertTrue(wed.isDisplayed());
		WebElement wed_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[6]"));
		Assert.assertTrue(wed_Timing.isDisplayed());

		WebElement thur = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Thursday')]"));
		Assert.assertTrue(thur.isDisplayed());
		WebElement thur_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[8]"));
		Assert.assertTrue(thur_Timing.isDisplayed());

		WebElement fri = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Friday')]"));
		Assert.assertTrue(fri.isDisplayed());
		WebElement fri_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[10]"));
		Assert.assertTrue(fri_Timing.isDisplayed());

		WebElement sat = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Saturday')]"));
		Assert.assertTrue(sat.isDisplayed());
		WebElement sat_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[12]"));
		Assert.assertTrue(sat_Timing.isDisplayed());

		WebElement sun = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Sunday')]"));
		Assert.assertTrue(sun.isDisplayed());
		WebElement sun_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[14]"));
		Assert.assertTrue(sun_Timing.isDisplayed());
		System.out.println(" #### Selected Location is Verified Successfully ####");

		WebElement ShowAllLocations = driver
				.findElement(By.xpath("//div[@id='panel']//a[contains(text(),'Show All Locations')]"));
		System.out.println(ShowAllLocations.getText());
		Assert.assertTrue(ShowAllLocations.isDisplayed());
		ShowAllLocations.click();
		Thread.sleep(2000);
		WebElement FoundLocationCount = driver.findElement(By.xpath(
				"//div[@id='panel']//table[@id='collection_poi']//thead//tr[@class='poi']//th//p[@id='poiTitle']"));
		System.out.println(FoundLocationCount.getText());
		Assert.assertTrue(FoundLocationCount.isDisplayed());
		System.out.println("We are Redirected to All Store Locations page");
	}

	public void VerifySelectedLocationDetails_StoreHours() throws InterruptedException {
		Thread.sleep(1500);
		WebElement FirstStore_StoreHours = driver
				.findElement(By.xpath("/descendant::span[contains(text(),'Store Hours')][3]"));
		FirstStore_StoreHours.click();
		Thread.sleep(1500);

		WebElement mon = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Monday')]"));
		Assert.assertTrue(mon.isDisplayed());
		WebElement mon_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[2]"));
		Assert.assertTrue(mon_Timing.isDisplayed());

		WebElement tue = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Tuesday')]"));
		Assert.assertTrue(tue.isDisplayed());
		WebElement tue_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[4]"));
		Assert.assertTrue(tue_Timing.isDisplayed());

		WebElement wed = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Wednesday')]"));
		Assert.assertTrue(wed.isDisplayed());
		WebElement wed_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[6]"));
		Assert.assertTrue(wed_Timing.isDisplayed());

		WebElement thur = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Thursday')]"));
		Assert.assertTrue(thur.isDisplayed());
		WebElement thur_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[8]"));
		Assert.assertTrue(thur_Timing.isDisplayed());

		WebElement fri = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Friday')]"));
		Assert.assertTrue(fri.isDisplayed());
		WebElement fri_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[10]"));
		Assert.assertTrue(fri_Timing.isDisplayed());

		WebElement sat = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Saturday')]"));
		Assert.assertTrue(sat.isDisplayed());
		WebElement sat_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[12]"));
		Assert.assertTrue(sat_Timing.isDisplayed());

		WebElement sun = driver.findElement(By.xpath("//div[@id='hours_section1']//div[contains(text(),'Sunday')]"));
		Assert.assertTrue(sun.isDisplayed());
		WebElement sun_Timing = driver.findElement(By.xpath("//tr[@class='even']//div[5]//div[2]//div[14]"));
		Assert.assertTrue(sun_Timing.isDisplayed());

		WebElement HideStoreHours = driver.findElement(By.xpath("//span[contains(text(),'Hide Store Hours')]"));
		HideStoreHours.click();
		Thread.sleep(1500);
		System.out.println(" #### Store hours for Selected Location is Verified Successfully ####");
	}

	public void VerifySelectedLocationDetails_ScoopShopWebsite() throws InterruptedException {
		Thread.sleep(1500);
		WebElement FirstStore_ScoopShopWebsite = driver.findElement(By.xpath(
				"//div[@class='showLinkjacklondon']/descendant::span[contains(text(),'Scoop Shop Website')][1]"));
		FirstStore_ScoopShopWebsite.click();
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

		WebElement FirstStore_OrderTakeOut = driver
				.findElement(By.xpath("/descendant::a[contains(text(),'Order Take Out')][2]"));
		FirstStore_OrderTakeOut.click();
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
