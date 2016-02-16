package support;



import hooks.TestHooks;
import io.appium.java_client.AppiumDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.MainScreen;
import pages.UserListScreen;


public class TestBase {

	public static AppiumDriver driver;



    @BeforeSuite
	public void setUp(){
		System.out.println("Starting Appium driver.....");
		driver = TestHooks.getDriver();
	}

	@AfterSuite
	public void tearDown(){
		System.out.println(".......Stopping Appium driver");
		driver.quit();
	}
}
