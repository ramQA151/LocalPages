package com.qa.Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.TestBase;

public class OfficeDepot extends TestBase{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='inputaddress']")
	WebElement inputField;
	
	@FindBy(xpath="//input[@id='locator_submit2']")
	WebElement SearchBtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr")
	List <WebElement> locations;
	
	@FindBy(xpath="//table[@id='toggleText']//td")
	List <WebElement> Filters;
	
	@FindBy(xpath="//input[@type='checkbox']")
	List <WebElement> checkbox;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[5]/a[4]")
	WebElement Direction;
	
	@FindBy(xpath="(//div[@class='addressWrapper bubble_leftCol'])[2]")
	WebElement Address;
	
	@FindBy(xpath="(//div[@class='storeWrapper bubble_rightCol'])[2]")
	WebElement Timing;
	
	@FindBy(xpath="(//input[@name='addressline'])[5]")
	WebElement ToName;
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	WebElement GoBtn;
	
	@FindBy(xpath="//td[normalize-space()='From (A):']")
	WebElement From;
	
	@FindBy(xpath="//td[normalize-space()='To (B):']")
	WebElement To;
	
	public OfficeDepot(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void EnterZip() throws Exception {
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		inputField.sendKeys("Santa Clara");
		Thread.sleep(10000);
		SearchBtn.click();
	
	}
	public void TotalLocations() throws Exception {
		EnterZip();
		for(WebElement location:locations)
		{
			System.out.println(location.getText());
		}
		}
	
	public void TotalFilters() throws Exception {
		Thread.sleep(10000);
		inputField.sendKeys("Santa Clara");
		SearchBtn.click();
			for(WebElement cb:checkbox )
			{
				for(WebElement ft:Filters) {
			String FilterName=ft.getText();
			cb.click();
			Thread.sleep(4000);
			if(cb.isEnabled()) {
				System.out.println(FilterName +" is clickable");
			}
			cb.click();
			
			System.out.println("Total address for: "+FilterName+ "are: "+locations.size());
	    	Thread.sleep(5000);
				}
			}
	}
	public void Direction() throws Exception {
		EnterZip();
		Direction.click();
		Thread.sleep(3000);
		System.out.println("Shop Address is: "+Address.getText());
		Thread.sleep(3000);
		System.out.println("-----------------------------");
		System.out.println("Shop timing is: " +Timing.getText());
		Thread.sleep(3000);
		ToName.sendKeys("50266");
		Thread.sleep(2000);
		GoBtn.click();
		Thread.sleep(6000);
		System.out.println(From.getText());
		Thread.sleep(3000);
		System.out.println(To.getText());
		}
}
