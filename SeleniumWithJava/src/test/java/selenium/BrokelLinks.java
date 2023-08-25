package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokelLinks {

	public static void main(String[] args) 
{
		
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.aiimagegenerator.com/"); 
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for(WebElement element : elements) {
			
			String URL = element.getAttribute("href");
			
			System.out.println("-------------------------");
			
			System.out.println(URL);
			
			if(URL==null || URL.isEmpty()) {
				
				System.out.println("URL is empty");
				
				continue;
				
			}
			
			HttpURLConnection huc;
			try {
				huc = (HttpURLConnection)(new URL(URL).openConnection());
				huc.connect();
				
				if(huc.getResponseCode()>=400) {
					
					System.out.println(URL+" is broken");
					
				}else {
					
					System.out.println(URL+" is a valid link");
					
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		driver.quit();
	}
	
}


