package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeletcsClassTypes {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		this.driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}
  @Test
  public void SelectByVisibleText() {
		
	    
	  
	  WebElement dd = driver.findElement(By.id("drop1"));
	  Select sel= new Select(dd);
	  sel.selectByVisibleText("doc 4");
	  System.out.println("Doc 4 selected");
	   
  }
  @Test
  public void selectByIndex() {
	
		WebElement dd = driver.findElement(By.id("drop1"));
		Select sel= new Select(dd);
		sel.selectByIndex(1);
		System.out.println("Doc 1 selected");
  }
  @Test
  public void SelectByValue() {

		
		WebElement dd = driver.findElement(By.id("drop1"));
		Select sel= new Select(dd);
		sel.selectByValue("ghi");
		System.out.println("Doc 2 selected");

  }
}
