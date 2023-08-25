package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionalBrowsers {
	public static void main(String[] args) {
		String Browser= "Edge";
		WebDriver driver=null;
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			System.out.println("Launched ChromeBrowser Successfully");
		}
		else if (Browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Launched EdgeBrowser Successfully");
		}
		else if (Browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Launched FirefoxBrowser Successfully");
		}
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
	}
}


