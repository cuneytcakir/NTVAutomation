package dogus.ntv.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvMainPage;
import dogus.ntv.page.NtvPhotoGalleryPage;
import dogus.ntv.page.NtvWeatherPage;

public class NTVWeatherTest extends BaseTest{
	
	@Before
	public void resetApp(){
		driver.resetApp();
	}
	
	@After
	public void closeApp(){
		driver.closeApp();
	}
	
	@Test
	public void checkWeatherCity(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather();
		Assert.assertTrue("Hava durumunda şehir bilgisi görülemiyor.",wp.isWeatherCity());
		
	}
	
	@Test
	public void checkWeatherText(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather();
		Assert.assertTrue("Hava durumu yazısı görülemiyor.",wp.isWeatherText());
		
	}
	
	@Test
	public void checkWeatherDate(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather();
		Assert.assertTrue("Hava durumunda tarih bilgisi görülemiyor.",wp.isWeatherDate());
		
	}
	
	@Test
	public void checkWeatherDegree(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather();
		Assert.assertTrue("Hava durumunda derece görülemiyor.",wp.isWeatherDegree());
		
	}
	
	@Test
	public void checkWeatherDegreeImage(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather();
		Assert.assertTrue("Hava durumunda derece görseli görülemiyor.",wp.isWeatherDegreeImage());
		
	}
	
	@Test
	public void checkWeatherImage(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather();
		Assert.assertTrue("Hava durumu görseli görülemiyor.",wp.isWeatherImage());
		
	}
	
	@Test
	public void checkWeatherIndicator(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather();
		Assert.assertTrue("Hava durumunda gün spinner'ı görülemiyor.",wp.isWeatherIndicator());
		
	}
	
	@Test
	public void checkWeatherSearch(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather();
		Assert.assertTrue("Hava durumunda şehir arama butonu görülemiyor.",wp.isWeatherSearch());
		
	}
	
	@Test
	public void clickSearch(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather()
		.clickWeatherSearch().EnterCity();
		Assert.assertTrue("Girilen şehir bulunamıyor.",wp.isCheckCity());
		
	}
	
	@Test
	public void controlCityWeather(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvWeatherPage wp = PageFactory.getInstance().createPage(NtvWeatherPage.class).clickWeather()
		.clickWeatherSearch().EnterCity().clickSearchCity();
		Assert.assertTrue("Farklı şehir için hava durumu geliyor.",wp.isCheckSelectedCity());
		
	}
	

}
