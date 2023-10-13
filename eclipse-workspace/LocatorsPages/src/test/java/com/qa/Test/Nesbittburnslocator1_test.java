package com.qa.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.Nesbittburnslocator1;

public class Nesbittburnslocator1_test extends TestBase {

	Nesbittburnslocator1 bmo1;
	public Nesbittburnslocator1_test() {
		super();
		}
	
	@BeforeClass
	public void setup() {
		initialization();
		 bmo1= new Nesbittburnslocator1(driver);
		 driver.get(prop.getProperty("nesbittburnslocator1"));
	}
	
	
	
	@Test(priority = 1)
	
	public void verifyHomeDetails_test() {
		bmo1.verifyHomeDetails();
	}
	
	@Test(priority = 2)
	public void Find_InvestmentAdvisorsByName_test() throws InterruptedException {
			bmo1.SearchByName();
	}
	
	@Test(priority = 3)
	public void Advisor_info_test() throws InterruptedException {
		bmo1.Advisor_info();
		}
	
	@Test(priority = 4)
	public void verifySendToEmail_test() throws InterruptedException {
		bmo1.verifySendToEmail();
	}
	
	@Test(priority = 5)
	public void VerifySendToMobile_test() throws InterruptedException {
		bmo1.SearchByName();
		bmo1.VerifySendToMobile();

	}
	  
	/*
	 * @Test(priority = 6) public void VerifyGetDirection_test() throws
	 * InterruptedException { //bmo1.SearchByName(); bmo1.VerifyGetdirection(); }
	 */
	
	@Test(priority = 6)
	public void Verifyprofiledetails_test() throws InterruptedException {
		//bmo1.SearchByName();
		bmo1.verify_profiledetails();
	}
	
	@AfterClass
	public void end() throws InterruptedException {
	Thread.sleep(3000);
		//driver.quit();
	}
}
