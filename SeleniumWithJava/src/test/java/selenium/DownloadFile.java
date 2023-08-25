package selenium;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {
	 WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options= new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		String downloadFilePath=	System.getProperty("user.dir");
		chromePrefs.put("download.default_directory", downloadFilePath);
		options.setExperimentalOption("prefs",chromePrefs);
		
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(4));
		driver.findElement(By.linkText("ZIP file")).click();
		Thread.sleep(3000);
		File file= new File(downloadFilePath + "\\DownloadDemo-master.zip\\");
		
		if(file.exists())
		{
			System.out.println("File got successfully Downloaded");
		}
}
	
}
