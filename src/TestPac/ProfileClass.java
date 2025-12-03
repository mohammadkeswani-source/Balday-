package TestPac;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Mainpac.SetupClass;
import io.appium.java_client.AppiumBy;

public class ProfileClass extends Mainpac.SetupClass {
	 private static final java.util.logging.Logger log =
	            java.util.logging.Logger.getLogger(ProfileClass.class.getName());
	 @BeforeTest
	    @Override
	    public void setup() throws MalformedURLException {
	        super.setup(); // IMPORTANT: Initialize driver
	        log.info("Setup Has been Initialized for Profile Class");
	    }

	    @Test
	    public void sampleTest() throws InterruptedException {
	        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));
	        
	        // click on profile tab

	        driver.findElement(
	                By.xpath("//android.widget.Button[@content-desc='Profile\nTab 4 of 4']"))
	                .click();
	        // click on settings
	        driver.findElement(AppiumBy.accessibilityId("Settings")).click();

	        System.out.println("Test executed!");
    }

}
