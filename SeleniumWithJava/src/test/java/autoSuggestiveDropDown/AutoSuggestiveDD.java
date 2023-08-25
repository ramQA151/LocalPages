package autoSuggestiveDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDD 
{
	WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		  Actions action= new Actions(driver);
		  action.moveToElement(logo).click().build().perform();
		
	}
  @Test
  public void DD() throws InterruptedException {
	  
	  driver.findElement(By.id("fromCity")).click();
	
	  
	  WebElement fromcity = driver.findElement(By.xpath("//*[@placeholder='From']"));
	 Thread.sleep(1000);
	  fromcity.sendKeys("Bang");
	  for(int i=0;i<=4;i++) {
		  fromcity.sendKeys(Keys.ARROW_DOWN);
	  }
	  fromcity.sendKeys(Keys.ENTER);
	  
	  driver.findElement(By.id("toCity")).click();
	  WebElement dropdown = driver.findElement(By.xpath("//*[@role='combobox']"));
	  
	
	  WebElement Tocity = driver.findElement(By.xpath("//*[@placeholder='To']"));
	
	Thread.sleep(1000);
	// Tocity.sendKeys("pune");
	  for(int j=0;j<=6;j++) {
		  Tocity.sendKeys(Keys.ARROW_DOWN);
	  }
	  Tocity.sendKeys(Keys.ENTER);
	  
	 
  }
  @Test
  public void SelectDate() {
	    
  driver.findElement(By.xpath("//*[@for='departure']")).click();
  
  
}
}













