package dogus.ntv.util.android;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NtvAndroidConstantsFinance extends NTVAndroidConstants{
	
	public NtvAndroidConstantsFinance(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String baseId= "com.dogus.ntv:id/";
	
	public By dolar_text = By.xpath("//android.view.View[@content-desc='DOLAR']");
	public By euro_text = By.xpath("//android.view.View[@content-desc='EURO']");
	public By bist_text = By.xpath("//android.view.View[@content-desc='BIST 100']");
	
	public By menu_finans = By.id( baseId + "buttonFinance");
	public By finans_refresh = By.id( baseId + "finance_refresh_image_button");

}
