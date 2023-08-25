package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Alert {

	@Test
	
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
			
			
}
}
