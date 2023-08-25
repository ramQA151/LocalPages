package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextWithoutSendkeysJSE {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
				
		ChromeOptions options =new ChromeOptions();
		//options.addArguments("disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//*[@name=\"search\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='iMac'", searchBox);

}
}