package dogus.ntv.base;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Connection;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public abstract class BasePageAndroidPhones extends BasePage {
	public BasePageAndroidPhones(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static final int DEFAULT_WAIT = 30;
	AndroidDriver driver;
	
	
	public void wifiIsEnabled(){
		driver.setConnection(Connection.WIFI);
	}
		
	public void dataIsEnabled(){
		driver.setConnection(Connection.DATA);
	}
	
	
	public void airplaneModeIsEnabled(){
		driver.setConnection(Connection.AIRPLANE);
	}
	
	public void noneModeIsEnabled(){
		driver.setConnection(Connection.NONE);
	}
	
	
	public void openNotifications(){
		((AndroidDriver)driver).openNotifications();
	}
}



