package com.qa.Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.Nesbittburnslocator;

public class Nesbittburnslocator_test extends TestBase {

	Nesbittburnslocator bmo;

	public Nesbittburnslocator_test() throws IOException {
		super();

	}

	@BeforeClass
	public void setup() throws IOException {
		initialization();
		bmo = new Nesbittburnslocator(driver);
		driver.get(prop.getProperty("nesbittburnslocator"));
	}

	@Test(priority = 1)

	public void verifyHomeDetails_test() throws InterruptedException {
		bmo.verifyHomeDetails();
	}

	@Test(priority = 2)
	public void Find_InvestmentAdvisors_test() throws InterruptedException {
		bmo.searchbylocation();
	}

	@Test(priority = 3)
	public void investment_info_test() throws InterruptedException {
		bmo.investment_info();

	}

	@Test(priority = 4)
	public void verifySendToEmail_test() throws InterruptedException {
		bmo.verifySendToEmail();

	}

	@Test(priority = 5)
	public void VerifyGetDirection_test() throws InterruptedException {
		bmo.VerifyGetDirection();
		
	}

	@Test(priority = 6)
	public void VerifySendToMobile_test() throws InterruptedException {
		bmo.VerifySendToMobile();
	}

	@Test(priority = 7)
	public void Verifyprofiledetails_test() throws InterruptedException {
		bmo.verify_profiledetails();
		
	}

	@Test(priority = 8)
	public void VerifyEmailMe_test() throws InterruptedException {
		bmo.VerifyEmailMe();
	}

	@AfterClass
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		//driver.quit();
	}
}
