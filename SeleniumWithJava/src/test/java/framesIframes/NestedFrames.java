package framesIframes;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {
	WebDriver driver;
	@BeforeMethod
	
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
	}
  @Test
  public void NestedFrame() {
	  WebElement ParentFrame = driver.findElement(By.xpath("//*[@src='/frame_top']"));
	  driver.switchTo().frame(ParentFrame);
	  
	  WebElement LeftFrame = driver.findElement(By.xpath("//*[@src='/frame_left']"));
	  driver.switchTo().frame(LeftFrame);
	  System.out.println(driver.findElement(By.xpath("//body")).getText());
	  
	  driver.switchTo().parentFrame();
	  
	  WebElement MiddleFrame = driver.findElement(By.xpath("//*[@src='/frame_middle']"));
	  driver.switchTo().frame(MiddleFrame);
	  System.out.println(driver.findElement(By.id("content")).getText());
	  
  }
}
