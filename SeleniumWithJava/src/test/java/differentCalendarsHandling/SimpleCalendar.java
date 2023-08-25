package differentCalendarsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleCalendar {
	
	WebDriver driver;
	@BeforeMethod
	
	public void InitializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
	}
	
	
  @Test
  public void HandleCalendar() throws InterruptedException {
	  WebElement calendar = driver.findElement(By.id("datepicker"));
	  calendar.click();
	  
	  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
	  
	  String MonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
	 
	  System.out.println(MonthYear);
	  String[] MY=MonthYear.split(" ");
	  String month=MY[0];
	  System.out.println(month);
	  String Year=MY[1];
	  System.out.println(Year);
	 		 
	
	  while(!(month.equals("July ") && Year.equals("2023"))){
		  driver.findElement(By.xpath("//*[@title='Prev']")).click();
		  
	  }
	  WebElement el= driver.findElement(By.xpath("//a[normalize-space()='6']"));
	  el.click();	  
  }
}
