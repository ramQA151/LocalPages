package com.qa.Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.TestBase;

public class Joann extends TestBase{
	WebDriver driver;
	
	@FindBy(css="#inputaddress")
	WebElement SearchBox;
	
	@FindBy(css="img#pseudoBtn")
	WebElement SearchBtn;
	
	@FindBy(xpath="//div[@class='div_row location_row my_store_status_0']")
	List <WebElement> stores;
	
	@FindBy(css="div#filterToggle")
	WebElement FilterBtn;
	
	@FindBy(xpath="//input[@type='checkbox']//..")
	List <WebElement> TotalFilters;
	
	@FindBy(xpath="//a[@id='lightwindow_title_bar_close_link']")
	WebElement Closebtn;
	
	@FindBy(xpath="//div[@class='applybtn']")
	WebElement ApplyFltrBtn;
	
	@FindBy(xpath="//a[@id='hoursShow1']")
	WebElement StoreDetailsBtn;
	
	@FindBy(xpath="(//div[@class='floatleftSection hidehoursno cvhoursHide'])[1]")
	WebElement StoreDetails;
	
	@FindBy(xpath="(//div[@class='floatleftSection hidehoursno cvhoursHide'])[1]")
	WebElement StoreHours;
	
	@FindBy(xpath="//a[@id='directionlinkD605']")
	WebElement Direction;
	
	@FindBy(xpath="(//input[@class='diradd addressentry'])[2]")
	WebElement EnterStartingpoint;
	
	@FindBy(xpath="(//button[@id='getDirections'])[2]")
	WebElement Gobtn;
	
	@FindBy(xpath="(//th[contains(text(),'From (A):')])[2]")
	WebElement FromLocation;
	
	@FindBy(xpath="(//th[contains(text(),'To (B):')])[2]")
	WebElement ToLocation;
	
	@FindBy(xpath="//a[normalize-space()='Search Again']")
	WebElement SearchAgainBtn;
	
	@FindBy(xpath="(//a[@data-gaact=\"Click_to_WeeklyStoreAd\"])[3]")
	WebElement WeeklyAdd;
	
	@FindBy(xpath="//a[@id='moreinfo605']")
	WebElement MoreInfo;
	
	@FindBy(xpath="//img[@class='object-fit--contain']")
	WebElement Logo;
	
	public Joann(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchLocation() throws Exception {
		Thread.sleep(9000);
		SearchBox.click();
		SearchBox.sendKeys("santa clara");
		SearchBtn.click();
		
	}
	public void allStores() throws Exception {
		searchLocation();
		for(WebElement store:stores) {
			System.out.println("Total storea for location are: "+store.getText() + '\n' +"And total count of stores is: " +stores.size());
		}
	}
	public void filterOption() throws Exception {
		searchLocation();
		FilterBtn.click();
		
		for(WebElement filter:TotalFilters)
		{	
			try {
			Thread.sleep(4000);
			filter.click();
			Thread.sleep(4000);
			System.out.println("Filter applied is: " +filter.getText() + " and total stores available are: "+ stores.size());
			filter.click();
		}
			catch(Exception e)
			{
				System.out.println("Zero Address Found for: "+filter.getText());
				Closebtn.click();
				Thread.sleep(4000);
				filter.click();
			}
			
	}
		ApplyFltrBtn.click();
	}	
	
	public void StoreDetailsBtn() throws Exception {
		searchLocation();
		StoreDetailsBtn.click();
		System.out.println(StoreHours.getText());
		
	}
	
	public void getDirection() throws Exception {
		searchLocation();
		Thread.sleep(3000);
		Direction.click();
		EnterStartingpoint.sendKeys("50131");
		System.out.println(" --------------");
		Gobtn.click();
		System.out.println(FromLocation.getText());
		System.out.println(ToLocation.getText());
		Thread.sleep(3000);
		SearchAgainBtn.click();
	}
	
	public void weeklyAdd() throws Exception {
		searchLocation();
		Thread.sleep(3000);
		WeeklyAdd.click();
		Thread.sleep(7000);
		Assert.assertEquals("https://hosted.where2getit.com/joann/mystore/locator.html", driver.getCurrentUrl());
		System.out.println("URL verified and matched");
		driver.close();
	
	}
	public void MoreInfo() throws Exception {
		searchLocation();
		Thread.sleep(3000);
		MoreInfo.isDisplayed();
		Thread.sleep(4000);		
	}
	}
