package testNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationAnnotation {

	@Parameters({"URL"})
	@Test
	
	public void LaunchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			driver.get(url);
			String ActTital=driver.getTitle();
			System.out.println(ActTital);
			
			String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			Assert.assertEquals(ActTital, ExpectedTitle);
			
		
	}
}

