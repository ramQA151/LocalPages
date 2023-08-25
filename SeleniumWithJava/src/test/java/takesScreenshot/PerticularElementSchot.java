package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerticularElementSchot {
	WebDriver driver;
	@BeforeMethod
	
	public void InitializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	}
  @Test
  public void perticularSectionScreenshot() throws IOException {
	  WebElement MultiSelectBox = driver.findElement(By.id("multiselect1"));
	  File srcFile=MultiSelectBox.getScreenshotAs(OutputType.FILE);
	  Date d= new Date();
	  String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
	  FileUtils.copyFile(srcFile,new File("./Screenshots/Mulltiselect.png" +FileName));
  }
}
