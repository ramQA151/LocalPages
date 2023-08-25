package selectClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiSelect {
	WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		  this.driver= new ChromeDriver();
		  driver.get("https://omayo.blogspot.com/");	
		
	}
  @Test
  public void SelectMultipleOptions() {
	  WebElement multiselect = driver.findElement(By.id("multiselect1"));
	  Select select= new Select(multiselect);
	  select.selectByIndex(1);
	  select.selectByVisibleText("Volvo");
	  
	   }
  @Test
  public void GetAllOptions() {
	  WebElement multiselect = driver.findElement(By.id("multiselect1"));
	  Select select= new Select(multiselect);
	  List<WebElement> AllOptions = select.getOptions();
	  for(WebElement option: AllOptions) {
		  System.out.println(option.getText());
	  }
  }
  
  @AfterTest
  public void TearDown() {
	  driver.close();
  }
}
