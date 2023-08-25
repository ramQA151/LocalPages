package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		//options.addArguments("disable-notifications");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(4));
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,1200)","");
		String filePath=System.getProperty("user.dir");
		
		driver.findElement(By.id("uploadfile")).sendKeys(filePath+"\\Files\\Tree.jpg");
}
}