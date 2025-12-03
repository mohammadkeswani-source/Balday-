	
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

	public class ABCclass {

		AndroidDriver  driver;

	    @BeforeTest
	    public void setup() throws MalformedURLException {

	        UiAutomator2Options options = new UiAutomator2Options();

	        // Platform info
	        options.setPlatformName("Android");
	        options.setPlatformVersion("14");

	        // Device info
	        options.setDeviceName("Pixel 7");
	        options.setAutomationName("UiAutomator2");
	        options.setAutoGrantPermissions(true);

	        // APK path
	        options.setApp("C:\\Users\\Admin\\Downloads\\app-stg-release.apk");

	        // Connect to Appium server
	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

	        System.out.println("App Launched Successfully!");
	          }	

	    @Test
	    public void sampleTest() throws InterruptedException {
	    	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));

	    	//	    	System.out.println("CLICK onThe Profile Button");
	    	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Profile\nTab 4 of 4']")).click();
	    	// click on settings button 
	    	driver.findElement(AppiumBy.accessibilityId("Settings")).click();


	        System.out.println("Test"
	        		+ " executed!");
	    }
	}

