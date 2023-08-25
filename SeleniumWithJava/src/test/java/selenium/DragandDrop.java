package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		//options.addArguments("disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement SourceElement = driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		WebElement dest = driver.findElement(By.id("//*[@id=\"amt7\"]/li"));
		Actions action= new Actions(driver);
		action.dragAndDrop(SourceElement, dest).build().perform();
	}
}
