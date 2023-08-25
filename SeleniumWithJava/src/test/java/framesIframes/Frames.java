package framesIframes;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	WebDriver driver;
	@BeforeTest
	public void Ibitializebrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
	}
		@Test
		public void FrameHandling() {
			
			WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
			textBox.clear();
			textBox.sendKeys("Ram Marshivane");
	}
		@Test
		public void EnterName() throws InterruptedException {
			//driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
			WebElement textBox1 = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
			Thread.sleep(2000);
			textBox1.sendKeys("Ram Marshivane");
		}
}
