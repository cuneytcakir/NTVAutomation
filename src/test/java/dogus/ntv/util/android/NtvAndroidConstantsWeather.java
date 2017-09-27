package dogus.ntv.util.android;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NtvAndroidConstantsWeather extends NTVAndroidConstants{
	
	public NtvAndroidConstantsWeather(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String baseId= "com.dogus.ntv:id/";
	
	public By menu_havadurumu = By.id( baseId + "buttonWeather");
	public By havadurumu_text = By.id( baseId + "weatherTitleTitilliumWebTextView");
	public By havadurumu_search = By.id( baseId + "weather_search_image_button");
	public By havadurumu_image = By.id( baseId + "weatherDetailImageView");
	public By havadurumu_degree = By.id( baseId + "weatherDetailDegreeTextView");
	public By havadurumu_degree_image = By.id( baseId + "weatherDegreeImageView");
	public By havadurumu_city = By.id( baseId + "weatherDetailCityNameTextView");
	public By havadurumu_date = By.id( baseId + "weatherDetailDateTextView");
	public By havadurumu_indicator = By.id( baseId + "indicator");
	public By city_textbox = By.id("android:id/search_src_text");
	public By list_city = By.id( baseId + "cityNameTitilliumWebTextView");
}
