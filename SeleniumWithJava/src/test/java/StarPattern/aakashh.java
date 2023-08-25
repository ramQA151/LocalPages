package StarPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aakashh {
	WebDriver driver;
	@BeforeMethod
	public void InitializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/auto-complete/");
		driver.manage().window().maximize();
	}
  @Test
	
	public void test1() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2656\"]/div[2]/div/div/div[1]/p/iframe")));
		WebElement fieldbox=driver.findElement(By.xpath("//*[@id=\'search\']"));
		fieldbox.sendKeys("Aakash");
	}
}
