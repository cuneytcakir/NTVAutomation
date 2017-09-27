package dogus.ntv.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvMainPage;

public class NTVMainPageTest extends BaseTest{
	
	@Before
	public void resetApp(){
		driver.resetApp();
	}
	
	@After
	public void closeApp(){
		driver.closeApp();
	}
	
	
	@Test
	public void checkMainPage(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class);
		Assert.assertTrue("Anasayfa açılmıyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void ClickAndControlMenu(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
	}
	
	@Test
	public void CheckNTVLogo(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde logo görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckNTVInfo(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde info butonu görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckMenuNews(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde info butonu görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckMenuVideoGallery(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde video galeri görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckPhotoGallery(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde foto galeri görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckMenuFinance(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde finans görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckMenuWeather(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde hava durumu görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckMenuProgramme(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde yayın akışı görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckMenuLiveStream(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde canlı izle görünmüyor.",np.isNTVMainPage());
		
	}
	
	@Test
	public void CheckMenuLiveRadio(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		Assert.assertTrue("Menüde canlı dinle görünmüyor.",np.isNTVMainPage());
		
	}
	

}
