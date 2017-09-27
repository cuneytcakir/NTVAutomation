package dogus.ntv.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvLiveRadioPage;
import dogus.ntv.page.NtvMainPage;

public class NTVLiveRadioTest extends BaseTest{
	
	@Before
	public void resetApp(){
		driver.resetApp();
	}
	
	@After
	public void closeApp(){
		driver.closeApp();
	}
	
	@Test
	public void checkLiveStream(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvLiveRadioPage lrp = PageFactory.getInstance().createPage(NtvLiveRadioPage.class).clickLiveRadio();
		Assert.assertTrue("Canlı Dinle açılmıyor.",lrp.isLiveRadioCheck());
		
	}
	
	@Test
	public void checkLiveStreamNotification(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvLiveRadioPage lrp = PageFactory.getInstance().createPage(NtvLiveRadioPage.class).clickLiveRadio()
				.openNoti();
		Assert.assertTrue("Canlı Dinle Notification'da NTVRadyo yazmıyor.",lrp.isNTVRadyoTitle());
		
	}
	
	@Test
	public void checkLiveStreamNotification2(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvLiveRadioPage lrp = PageFactory.getInstance().createPage(NtvLiveRadioPage.class).clickLiveRadio()
				.openNoti();
		Assert.assertTrue("Canlı Dinle Notification'da açıklama kısmı gelmiyor.",lrp.isNTVRadyoText());
		
	}

}
