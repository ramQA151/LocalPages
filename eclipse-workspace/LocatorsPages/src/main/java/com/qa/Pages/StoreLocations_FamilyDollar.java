package com.qa.Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class StoreLocations_FamilyDollar extends TestBase {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='inputaddress']")
	WebElement PostalCode;
	
	@FindBy(xpath="//input[@id='search_button']")
	WebElement FindStoreBtn;
	
	@FindBy(xpath="//li[@class='poi-item']")
	List <WebElement> AllAddress;
	
	@FindBy(xpath="//div[ @class='store-amenities']")
	WebElement Amenities;
	
	@FindBy(xpath="//*[@id=\"poiEl\"]/ul/li[1]/div[2]/div[5]/a")
	WebElement MoreInfo;
	
	@FindBy(xpath="//span[contains(text(),'Welcome')]")
	WebElement MoreInfoLinkHeadLine;
	
	@FindBy(xpath="//*[@id=\"poiEl\"]/ul/li[1]/div[2]/div[11]/a")
	WebElement WeeklyAdd;
	
	@FindBy(xpath="//h1[contains(text(),'Family ')]")
	WebElement WeeklyAddHeading;
	
	@FindBy(xpath="//*[@id=\"hideAreaMobile\"]/div[2]/button")
	WebElement filterBtn;
	
	@FindBy(xpath="//div[@class='input-box']")
	List <WebElement> FilterOptions;
	
	@FindBy(xpath="//div[@class='poi_address']")
	List <WebElement> address;
	
	@FindBy(xpath="//span[contains(text(),'Directions')]")
	WebElement Direction;

	public StoreLocations_FamilyDollar(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void postalAddress() throws Exception {
		PostalCode.click();
		Thread.sleep(2000);
		PostalCode.sendKeys("50266");
		Thread.sleep(3000);
		FindStoreBtn.click();
		Thread.sleep(3000);
       
        }	
	public void TotalAddress() throws Exception {
		PostalCode.click();
		Thread.sleep(1000);
		PostalCode.sendKeys("50266");
		FindStoreBtn.click();
		Thread.sleep(3000);
		for(WebElement Address: AllAddress) {
		String Adr = Address.getText();
	     System.out.println("Address Number: " +Adr);
		}
		}
		
		public void TotalAminities() throws Exception {
		PostalCode.click();
		Thread.sleep(1000);
		PostalCode.sendKeys("50266");
		FindStoreBtn.click();
		Thread.sleep(3000);
		String ExpAminities=("Tobacco");
		String ActAminities = Amenities.getText();
		System.out.println("Following Aminities are availabe: " +ActAminities);
		if(ActAminities.contains(ExpAminities)) 
		{
		System.out.println("Aminities are available");
		}
		}
		public void MoreInfoLink() throws Exception {
		PostalCode.click();
		Thread.sleep(1000);
		PostalCode.sendKeys("50266");
		FindStoreBtn.click();
		Thread.sleep(1000);
		MoreInfo.click();
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String windowHandle : allWindowHandles) {
		  if (!windowHandle.equals(parentWindowHandle)) {
		  driver.switchTo().window(windowHandle);
	    }
		}
		Thread.sleep(6000);
		System.out.println("Title of child window is: "+driver.getTitle());
		System.out.println("Heading is: "+MoreInfoLinkHeadLine.getText());
		driver.close();
		driver.switchTo().window(parentWindowHandle);
}
		public void WeeklyAdd() throws Exception {
		PostalCode.click();
		Thread.sleep(1000);
		PostalCode.sendKeys("50266");
		FindStoreBtn.click();
		Thread.sleep(1000);
		WeeklyAdd.click();
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String windowHandle : allWindowHandles) {
	    if (!windowHandle.equals(parentWindowHandle)) {
	    driver.switchTo().window(windowHandle);
	    }}
		Thread.sleep(6000);
		System.out.println("Title of child window is: "+driver.getTitle());
		System.out.println(WeeklyAddHeading.getText());
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		}
		
		public void Filter() throws Exception {
		PostalCode.click();
		Thread.sleep(1000);
		PostalCode.sendKeys("50266");
		FindStoreBtn.click();
		Thread.sleep(3000);
		filterBtn.click();
		System.out.println("Filter button is clickable");
		}
		
		public void FilterOptions() throws Exception {
		PostalCode.click();
		Thread.sleep(1000);
		PostalCode.sendKeys("50266");
		FindStoreBtn.click();
		Thread.sleep(3000);
		filterBtn.click();
		Thread.sleep(3000);
		int TotalFilter=FilterOptions.size();
		System.out.println("Total filter options are: "+FilterOptions.size());    
		int FilterCount= 12;
		if(FilterCount==TotalFilter) {
			System.out.println("Total filter numbers are matched");
		}
		}
		public void ClickingFilterOptions() throws Exception {
			PostalCode.click();
			Thread.sleep(1000);
			PostalCode.sendKeys("50266");
			FindStoreBtn.click();
			Thread.sleep(3000);
			filterBtn.click();
			Thread.sleep(3000);
			System.out.println(FilterOptions.size());  
    		for(WebElement ft:FilterOptions)
    		{
    		String FilterName=ft.getText();
    		ft.click();
    		Thread.sleep(4000);
    		if(ft.isEnabled()) {
    			System.out.println(FilterName +" is clickable");
    		}
    		ft.click();
    		
    		System.out.println("Total address for: "+FilterName+ "are: "+address.size());
        	Thread.sleep(5000);
    		}
		}
    		public void MapDirection() throws Exception {
    			PostalCode.click();
    			Thread.sleep(1000);
    			PostalCode.sendKeys("50266");
    			FindStoreBtn.click();
    			Thread.sleep(3000);
    			Direction.click();
    			Thread.sleep(3000);
    			System.out.println("Title of page is: "+driver.getTitle());
    			driver.navigate().back();
		}
}

