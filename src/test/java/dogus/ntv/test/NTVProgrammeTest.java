package dogus.ntv.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvMainPage;
import dogus.ntv.page.NtvProgrammePage;

public class NTVProgrammeTest extends BaseTest{
	
	@Before
	public void resetApp(){
		driver.resetApp();
	}
	
	@After
	public void closeApp(){
		driver.closeApp();
	}
	
	@Test
	public void checkProgrammePage(){
		NtvMainPage np = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvProgrammePage pp = PageFactory.getInstance().createPage(NtvProgrammePage.class).clickProgramme();
		Assert.assertTrue("Yayın akışı sayfası açılmıyor.",pp.isProgrammeCheck());
		
	}

}
