package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() {
		return driver;
	}

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(".\\src\\main\\java\\com\\qa\\config\\Config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static WebDriver initialization() {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("window-size=1360,768");

			ChromeOptions cap = new ChromeOptions();
			cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, UnexpectedAlertBehaviour.IGNORE);
			
			
		        //Add chrome switch to disable notification - "**--disable-notifications**"
		        options.addArguments("--disable-notifications");
			/*
			 * DesiredCapabilities cap = DesiredCapabilities.chrome();
			 * cap.setCapability(ChromeOptions.CAPABILITY, options);
			 */
//		        Map<String, Object> prefs = new HashMap<String, Object>();
//		        Map<String, Object> profile = new HashMap<String, Object>();
//		        Map<String, Object> contentSettings = new HashMap<String, Object>();
//		        contentSettings.put("cookies", 2);
//		        profile.put("managed_default_content_settings", contentSettings);
//		        prefs.put("profile", profile);
//		        options.setExperimentalOption("prefs", prefs);
		//        WebDriverManager.chromedriver().setup();
		//        driver = new ChromeDriver(options);
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
		//	options.addArguments("start-maximized");
			options.addArguments("enable-automation");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-browser-side-navigation");
			options.addArguments("--disable-gpu");
			driver = new ChromeDriver(options);
			

		}

		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					".\\src\\main\\java\\com\\b1\\qa\\resourceFiles\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.get(prop.getProperty("ATT"));
		// driver.get("https://ignite.where2stageit.com/login.html");
		// driver.get("https://ignite.where2getit.com/login.html");
		return driver;
	}

}
