package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class Dollertree extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "//iframe[@title='Store Locator']")
	WebElement iframe;

	@FindBy(xpath = "//span[@aria-hidden=\"true\"]")
	WebElement CloseBtn;

	@FindBy(xpath = "//input[@id='search-input']")
	WebElement SearchBox;

	@FindBy(xpath = "//input[@id='search_button']")
	WebElement Searchbtn;

	@FindBy(xpath = "//div[@class='poi_address']")
	List<WebElement> TotalStores;

	@FindBy(xpath = "//select[@id='searchradius']")
	WebElement Searchradius;

	@FindBy(xpath = "//option[contains(text(),' miles')]")
	List<WebElement> Miles;

	@FindBy(xpath = "//li[@class='shwfilter']")
	List<WebElement> Aminities;
	
	@FindBy(xpath="(//ul[@class='poi-hrs'])[1]")
	WebElement StoreTiming;
	
	@FindBy(xpath="(//div[@class='desktop'])[1]")
	WebElement StoreAminities;

	@FindBy(xpath="(//a[contains(text(),'Ship To This Store')])[1]")
	WebElement ShiptoStore;
	public Dollertree(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void Searchlocation() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame(iframe);

		CloseBtn.click();
		SearchBox.click();
		SearchBox.clear();
		SearchBox.sendKeys("Santa Clara");
		Searchbtn.click();
	}

	@Test
	public void totalStores() throws InterruptedException {
		Searchlocation();
		for (WebElement stores : TotalStores) {
			System.out.println(stores.getText() + "\n" + " and total number of stores is: " + TotalStores.size());
		}
	}

	@Test
	public void ApplyFilter() throws InterruptedException {
		Searchlocation();
		for (WebElement stores : TotalStores) {
			System.out.println(stores.getText() + "\n" + " and total number of stores is: " + TotalStores.size());
		}
	}

	@Test
	public void Searchradius() throws InterruptedException {
		Searchlocation();
		Searchradius.click();
		for (WebElement Mile : Miles) {
			Thread.sleep(2000);
			Mile.click();
			Thread.sleep(2000);
			for (WebElement Aminity : Aminities) {
				Thread.sleep(2000);
				Aminity.click();
				System.out.println("For " + Mile.getText() + " distance " + "and for " + Aminity.getText()
						+ " total sotrs available are: " + TotalStores.size());
				Thread.sleep(2000);
				Aminity.click();
			}
			Mile.click();
			Thread.sleep(2000);
			Searchbtn.click();
		}
	}

	@Test
	public void StoreDetails() throws InterruptedException {
		Searchlocation();
		System.out.println(StoreTiming.getText());
	System.out.println(StoreAminities.getText());
	if(ShiptoStore.isDisplayed()) {
		System.out.println("Ship to this store is available");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
