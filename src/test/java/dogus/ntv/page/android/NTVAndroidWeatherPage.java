package dogus.ntv.page.android;

import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvWeatherPage;
import dogus.ntv.util.android.NtvAndroidConstantsWeather;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidWeatherPage extends NtvAndroidConstantsWeather implements NtvWeatherPage{

	public NTVAndroidWeatherPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public NtvWeatherPage clickWeather() {
		waitSeconds(3);
        clickAndWaitForElement(menu_havadurumu);
		waitSeconds(3);
		return PageFactory.getInstance().createPage(NtvWeatherPage.class);
	}
	
	@Override
	public boolean isWeatherText() {
		waitSeconds(3);
		return isExist(3, havadurumu_text);
	}
	
	@Override
	public boolean isWeatherCity() {
		waitSeconds(3);
		return isExist(3, havadurumu_city);
	}
	
	@Override
	public boolean isWeatherDate() {
		waitSeconds(3);
		return isExist(3, havadurumu_date);
	}
	
	@Override
	public boolean isWeatherDegree() {
		waitSeconds(3);
		return isExist(3, havadurumu_degree);
	}
	
	@Override
	public boolean isWeatherDegreeImage() {
		waitSeconds(3);
		return isExist(3, havadurumu_degree_image);
	}
	
	@Override
	public boolean isWeatherImage() {
		waitSeconds(3);
		return isExist(3, havadurumu_image);
	}
	
	@Override
	public boolean isWeatherIndicator() {
		waitSeconds(3);
		return isExist(3, havadurumu_indicator);
	}
	
	@Override
	public boolean isWeatherSearch() {
		waitSeconds(3);
		return isExist(3, havadurumu_search);
	}
	
	@Override
	public NtvWeatherPage clickWeatherSearch() {
		waitSeconds(3);
        clickAndWaitForElement(havadurumu_search);
		waitSeconds(3);
		return PageFactory.getInstance().createPage(NtvWeatherPage.class);
	}
	
	@Override
	public NtvWeatherPage EnterCity() {
		waitSeconds(3);
		sendKeysAndWaitForElement(city_textbox,"rize");
		return PageFactory.getInstance().createPage(NtvWeatherPage.class);
	}
	
	@Override
	public boolean isCheckCity() {
	    boolean x = true;
	    
	    if (GetElementText("cityNameTitilliumWebTextView") != "adana") {
	        x = false;
	    } 
	    else {
	        x = true;
	    }
	    return x;

	}
	
	@Override
	public NtvWeatherPage clickSearchCity() {
		waitSeconds(3);
        clickAndWaitForElement(list_city);
		waitSeconds(3);
		return PageFactory.getInstance().createPage(NtvWeatherPage.class);
	}
	
	@Override
	public boolean isCheckSelectedCity() {
	    boolean x = true;
	    
	    if (GetElementText("weatherDetailCityNameTextView") != "Rize") {
	        x = true;
	    } 
	    else {
	        x = false;
	    }
	    return x;

	}
}
