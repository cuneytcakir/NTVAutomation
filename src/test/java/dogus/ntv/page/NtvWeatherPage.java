package dogus.ntv.page;

public interface NtvWeatherPage {

	boolean isWeatherText();
	boolean isWeatherCity();
	boolean isWeatherDate();
	boolean isWeatherDegree();
	boolean isWeatherDegreeImage();
	boolean isWeatherImage();
	boolean isWeatherIndicator();
	boolean isWeatherSearch();
	NtvWeatherPage clickWeatherSearch();
	NtvWeatherPage EnterCity();
	boolean isCheckCity();
	NtvWeatherPage clickWeather();
	NtvWeatherPage clickSearchCity();
	boolean isCheckSelectedCity();

}
