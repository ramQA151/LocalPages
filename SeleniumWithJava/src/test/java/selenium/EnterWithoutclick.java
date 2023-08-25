package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterWithoutclick {
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
			
			ChromeOptions options =new ChromeOptions();
			//options.addArguments("disable-notifications");
			WebDriver driver= new ChromeDriver(options);
			driver.get("https://tutorialsninja.com//demo//index.php?route=account/login");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("a.btn.btn-primary")).sendKeys(Keys.ENTER);
		}
	}


