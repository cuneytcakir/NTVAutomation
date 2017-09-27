package dogus.ntv.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvFinancePage;
import dogus.ntv.page.NtvMainPage;
import dogus.ntv.page.NtvNewsPage;

public class NTVFinanceTest extends BaseTest{
	
	@Before
	public void resetApp(){
		driver.resetApp();
	}
	
	@After
	public void closeApp(){
		driver.closeApp();
	}
	
	@Test
	public void checkDolar(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvFinancePage fp = PageFactory.getInstance().createPage(NtvFinancePage.class).isNTVClickFinance();
		Assert.assertTrue("Dolar bilgisi gelmiyor.",fp.isDolarCheck());
		
	}
	
	@Test
	public void checkEuro(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvFinancePage fp = PageFactory.getInstance().createPage(NtvFinancePage.class).isNTVClickFinance();
		Assert.assertTrue("Euro bilgisi gelmiyor.",fp.isEuroCheck());
		
	}
	
	@Test
	public void checkBist(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvFinancePage fp = PageFactory.getInstance().createPage(NtvFinancePage.class).isNTVClickFinance();
		Assert.assertTrue("Bist 100 bilgisi gelmiyor.",fp.isBistCheck());
		
	}
	
	@Test
	public void clickRefreshandCheck(){
		NtvMainPage mp = PageFactory.getInstance().createPage(NtvMainPage.class).isNTVClickMenu();
		NtvFinancePage fp = PageFactory.getInstance().createPage(NtvFinancePage.class).isNTVClickFinance().isNTVClickRefresh();
		Assert.assertTrue("Kur bilgileri gelmiyor.",fp.isDolarCheck());
		
	}

}
