package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EntireWebpage {
	FirefoxDriver driver;
	@BeforeMethod
	
	public void InitializeBrowser() {
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	}
  @Test
  public void FullPageScreenshot() throws IOException {
	File srcFile=  driver.getFullPageScreenshotAs(OutputType.FILE);
	  FileHandler.copy(srcFile, new File("./Screenshots/fullscreen.png"));
	  
  }
}
