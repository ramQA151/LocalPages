package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ByIndex {
  @Test
  public void selectByIndex() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("drop1"));
		Select sel= new Select(dd);
		sel.selectByIndex(1);
		System.out.println("Doc 1 selected");
  }
}
