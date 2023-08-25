package framesIframes;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FrameinFrame {
	 WebDriver driver;
  @Test
  public void ChildFrame() {
	 WebElement Frame = driver.findElement(By.id("firstFr"));
	 driver.switchTo().frame(Frame);
	 driver.findElement(By.name("fname")).sendKeys("Ram");
	 driver.findElement(By.name("lname")).sendKeys("Marshivane");
	 WebElement Frame2 = driver.findElement(By.xpath("//*[@src='innerFrame']"));
	 driver.switchTo().frame(Frame2);
	 driver.findElement(By.name("email")).sendKeys("ram@gmail.com");
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	  driver.get("https://letcode.in/frame");
	  driver.manage().window().maximize();
  }
  

  @AfterMethod
  public void teardown() {
	  driver.quit();
	  
  }

}
