package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlevsHandles {
			
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options =new ChromeOptions();
			//options.addArguments("disable-notifications");
			WebDriver driver= new ChromeDriver(options);
			
			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");
			Thread.sleep(5000);
			driver.findElement(By.linkText("Open a popup window")).click();
			//driver.findElement(By.xpath("//*[@id=\"HTML37\"]/div[1]/p/a")).click();
			String defaultWindow = driver.getWindowHandle();
			Set<String> allWindows = driver.getWindowHandles();
			Iterator<String> itr = allWindows.iterator();
			itr.next(); //first window handle
			System.out.println(driver.getTitle());
			String childWindow = itr.next(); //2nd window handle
			driver.switchTo().window(childWindow);

}
}
