package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHiddenElements {
	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options =new ChromeOptions();
			//options.addArguments("disable-notifications");
			WebDriver driver= new ChromeDriver(options);
			
			driver.manage().window().maximize();
			driver.get("https://www.letskodeit.com/practice");
			driver.findElement(By.id("show-textbox")).click();
			//driver.findElement(By.id("displayed-text")).sendKeys("Ram Marshivane");
			
			driver.findElement(By.id("hide-textbox")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('displayed-text').value=('Ram')");
		}
		

}
