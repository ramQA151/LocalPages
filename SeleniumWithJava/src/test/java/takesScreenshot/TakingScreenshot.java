package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot {
	WebDriver driver;
	@BeforeMethod
	
	public void InitializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	}
  @Test
  public void Screenshot() throws IOException {
	 Date d= new Date();
	
      String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
      File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileHandler.copy(srcFile, new File("./Screenshot/" + FileName));

	  
	  
  }
}
