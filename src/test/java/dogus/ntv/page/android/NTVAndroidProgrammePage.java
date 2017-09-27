package dogus.ntv.page.android;

import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvProgrammePage;
import dogus.ntv.util.android.NtvAndroidConstantsProgramme;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidProgrammePage extends NtvAndroidConstantsProgramme implements NtvProgrammePage{
	
	public NTVAndroidProgrammePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public NtvProgrammePage clickProgramme() {
		waitSeconds(3);
        clickAndWaitForElement(programme_button);
		waitSeconds(3);
		return PageFactory.getInstance().createPage(NtvProgrammePage.class);
	}
	
	@Override
	public boolean isProgrammeCheck() {
		waitSeconds(3);
		return isExist(3, yayin_akisi);
	}

}
