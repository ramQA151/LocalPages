package listenersAnnotation;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners (ListnersDemo.class)
public class DemoClass1 {

	@Test
	public void Method1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			Assert.assertEquals(driver.getTitle(),"Your Store");
	}
}
