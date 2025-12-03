	
	package Mainpac;
	import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.options.UiAutomator2Options;

	import org.openqa.selenium.By;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import java.net.MalformedURLException;
	import java.net.URL;

	public class SetupClass {

		protected AndroidDriver  driver;

	    
	    public void setup() throws MalformedURLException {
	    	UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("Android");
	        options.setPlatformVersion("14");
	        options.setDeviceName("Pixel 7");
	        options.setAutomationName("UiAutomator2");
	        options.setAutoGrantPermissions(true);
	        options.setApp("C:\\Users\\Admin\\Downloads\\app-stg-release.apk");

	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

	        System.out.println("App Launched Successfully!");
	        
	    }	
	    

	}

