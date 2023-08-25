package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptions {
  @Test
  public void AllOptions() {
	
		  WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();
			WebElement dd = driver.findElement(By.id("drop1"));
			Select sel= new Select(dd);
			List<WebElement> options = sel.getOptions();
			for(WebElement option: options) {
				System.out.println(option.getText());
			}
			
	  }
  }
