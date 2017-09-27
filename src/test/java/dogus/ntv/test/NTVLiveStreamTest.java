package dogus.ntv.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvLiveStreamPage;
import dogus.ntv.page.NtvMainPage;

public class NTVLiveStreamTest extends BaseTest{
	
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
		NtvLiveStreamPage lsp = PageFactory.getInstance().createPage(NtvLiveStreamPage.class).clickLiveStream();
		Assert.assertTrue("Canlı Yayın sayfası açılmıyor.",lsp.isLiveStreamCheck());
		
	}

}
