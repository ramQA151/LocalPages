package com.qa.Pages;

import java.util.ArrayList;
import java.util.List;
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

import com.qa.Base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;
public class CrackerBarrel_localPage extends TestBase {
	 WebDriver driver;
	
	@FindBy(xpath = "//h2[@class='title-text']")
	WebElement title_name;
	
	@FindBy(xpath = "//div[@class='openinghours']")
	WebElement opeinghour;
	
	@FindBy(xpath = "//div[@class='store-details']//div[@class='address']")
	WebElement storeaddress;
	
	@FindBy(xpath = "//span[contains(text(),'909-350-3902')]")
	WebElement Storenumber;
	
	@FindBy(xpath = "//span[contains(text(),'Directions')]")
	WebElement directions;
	
	@FindBy(xpath = "//a[@id='order-online-btn']")
	WebElement order_btn;
	
	@FindBy(xpath = "//h2[contains(text(),'Store hours Details')]")
	WebElement hourheading;
	
	@FindBy(xpath = "//div[@class='all-hours']")
	WebDriver storehourtable;
	
	
	public CrackerBarrel_localPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public void VerifyShopDetails() throws InterruptedException {
		Assert.assertTrue(title_name.isDisplayed());
		System.out.println("Store Name is :- "+title_name.getText());
		Assert.assertTrue(opeinghour.isDisplayed());
		System.out.println("Store open at :- "+ opeinghour.getText());
		Assert.assertTrue(Storenumber.isDisplayed());
		System.out.println("Store number is :- "+ Storenumber.getText());
		Assert.assertTrue(storeaddress.isDisplayed());
		System.out.println("Store Address is :- "+storeaddress.getText());
		Assert.assertTrue(order_btn.isEnabled());
		System.out.println("Order Online Button is Enabled");
		
		 
		}
	public void verifydirectionandhourslist() throws InterruptedException {
		Thread.sleep(3000);
		directions.click();
		ArrayList<String>tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(10000);
		WebElement StoreName=driver.findElement(By.xpath("//div[@aria-label=\"Cracker Barrel Old Country Store\"]//h1[contains(text(),'Cracker Barrel Old Country Store')]"));
		Assert.assertTrue(StoreName.isDisplayed());
		System.out.println("Old Store name is :- "+ StoreName.getText());
		driver.close();
		driver.switchTo().window(tab.get(0));
		Thread.sleep(3000);
		Assert.assertTrue(hourheading.isDisplayed());
		System.out.println(hourheading.getText());
		List<WebElement>listhr=driver.findElements(By.xpath("//div[@class='all-hours']"));
		for(WebElement list:listhr) {
			System.out.println(list.getText());
		}
	}
}