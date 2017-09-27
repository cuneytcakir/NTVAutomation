package dogus.ntv.page.android;

import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvFinancePage;
import dogus.ntv.page.NtvMainPage;
import dogus.ntv.page.NtvNewsPage;
import dogus.ntv.util.android.NtvAndroidConstantsFinance;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidFinancePage extends NtvAndroidConstantsFinance implements NtvFinancePage{
	
	public NTVAndroidFinancePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isDolarCheck() {
		waitSeconds(5);
		return isExist(3, dolar_text);
	}
	
	@Override
	public boolean isEuroCheck() {
		waitSeconds(5);
		return isExist(3, euro_text);
	}
	
	@Override
	public boolean isBistCheck() {
		waitSeconds(5);
		return isExist(3, bist_text);
	}
	
	@Override
	public NtvFinancePage isNTVClickFinance() {
		waitSeconds(3);
		clickAndWaitForElement(menu_finans);
		return PageFactory.getInstance().createPage(NtvFinancePage.class);
	}
	
	@Override
	public NtvFinancePage isNTVClickRefresh() {
		waitSeconds(3);
		clickAndWaitForElement(finans_refresh);
		return PageFactory.getInstance().createPage(NtvFinancePage.class);
	}

}
