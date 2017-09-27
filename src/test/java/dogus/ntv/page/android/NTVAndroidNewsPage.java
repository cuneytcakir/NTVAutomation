package dogus.ntv.page.android;

import org.openqa.selenium.By;

import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvNewsPage;
import dogus.ntv.util.android.NtvAndroidConstantsMainPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidNewsPage extends NtvAndroidConstantsMainPage implements NtvNewsPage{
	
	public NTVAndroidNewsPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isNTVNewsPage() {
		waitSeconds(3);
		return isExist(3, news_list);
	}
	
	@Override
	public NtvNewsPage clickNews() {
		waitSeconds(3);
        clickAndWaitForElement(first_news);
		waitSeconds(3);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public NtvNewsPage getNewstitle() {
		waitSeconds(2);
		getNewsTitle(haber_baslik);
		waitSeconds(2);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public NtvNewsPage swipeUp() {
		waitSeconds(5);
		swipeUpAccordingToPhoneSize();
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public NtvNewsPage swipeUpToBottom() {
		waitSeconds(5);
		swipeUpMultiple(3);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean isNTVHeaderNewsImage() {
		waitSeconds(3);
		return isExist(3, header_image);
	}
	
	@Override
	public boolean isNTVNewsImage() {
		waitSeconds(3);
		return isExist(3, news_image);
	}
	
	@Override
	public NtvNewsPage clickCategory() {
		waitSeconds(3);
        clickAndWaitForElement(news_category);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public NtvNewsPage swipeUpCategory() {
		waitSeconds(3);
		swipeUpByIdMultiple(1);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public NtvNewsPage clickCategoryTurkiye() {
		waitSeconds(3);
        clickAndWaitForElement(turkiye_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategoryTurkiye() {
		waitSeconds(3);
		return isExist(3, category_turkiye);
	}
	
	@Override
	public NtvNewsPage clickCategoryDunya() {
		waitSeconds(3);
        clickAndWaitForElement(dunya_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategoryDunya() {
		waitSeconds(3);
		return isExist(3, category_dunya);
	}
	
	@Override
	public NtvNewsPage clickCategoryEkonomi() {
		waitSeconds(3);
        clickAndWaitForElement(ekonomi_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategoryEkonomi() {
		waitSeconds(3);
		return isExist(3, category_ekonomi);
	}
	
	@Override
	public NtvNewsPage clickCategorySpor() {
		waitSeconds(3);
        clickAndWaitForElement(spor_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategorySpor() {
		waitSeconds(3);
		return isExist(3, category_spor);
	}
	
	@Override
	public NtvNewsPage clickCategoryYasam() {
		waitSeconds(3);
        clickAndWaitForElement(yasam_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategoryYasam() {
		waitSeconds(3);
		return isExist(3, category_yasam);
	}
	
	@Override
	public NtvNewsPage clickCategorySaglik() {
		waitSeconds(3);
        clickAndWaitForElement(saglik_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategorySaglik() {
		waitSeconds(3);
		return isExist(3, category_saglik);
	}
	
	@Override
	public NtvNewsPage clickCategoryTeknoloji() {
		waitSeconds(3);
        clickAndWaitForElement(teknoloji_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategoryTeknoloji() {
		waitSeconds(3);
		return isExist(3, category_teknoloji);
	}
	
	@Override
	public NtvNewsPage clickCategoryEmlak() {
		waitSeconds(3);
        clickAndWaitForElement(emlak_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategoryEmlak() {
		waitSeconds(3);
		return isExist(3, category_emlak);
	}
	
	@Override
	public NtvNewsPage clickCategorySanat() {
		waitSeconds(3);
        clickAndWaitForElement(sanat_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategorySanat() {
		waitSeconds(3);
		return isExist(3, category_sanat);
	}
	
	@Override
	public NtvNewsPage clickCategoryOtomobil() {
		waitSeconds(3);
        clickAndWaitForElement(otomobil_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategoryOtomobil() {
		waitSeconds(3);
		return isExist(3, category_otomobil);
	}
	
	@Override
	public NtvNewsPage clickCategoryEgitim() {
		waitSeconds(3);
        clickAndWaitForElement(egitim_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvNewsPage.class);
	}
	
	@Override
	public boolean ischeckCategoryEgitim() {
		waitSeconds(3);
		return isExist(3, category_egitim);
	}
	
	@Override
	public boolean isNTVAnasayfaImage() {
		waitSeconds(1);
		return isExist(3, anasayfa_image);
	}
	
	@Override
	public boolean isNTVAnasayfaText() {
		waitSeconds(1);
		return isExist(3, anasayfa_text);
	}
	
	@Override
	public boolean isNTVTurkiyeImage() {
		waitSeconds(1);
		return isExist(3, turkiye_image);
	}
	
	@Override
	public boolean isNTVTurkiyeText() {
		waitSeconds(1);
		return isExist(3, turkiye_text);
	}
	
	@Override
	public boolean isNTVDunyaImage() {
		waitSeconds(1);
		return isExist(3, dunya_image);
	}
	
	@Override
	public boolean isNTVDunyaText() {
		waitSeconds(1);
		return isExist(3, dunya_text);
	}
	
	@Override
	public boolean isNTVEkonomiImage() {
		waitSeconds(1);
		return isExist(3, ekonomi_image);
	}
	
	@Override
	public boolean isNTVEkonomiText() {
		waitSeconds(1);
		return isExist(3, ekonomi_text);
	}
	
	@Override
	public boolean isNTVSporImage() {
		waitSeconds(1);
		return isExist(3, spor_image);
	}
	
	@Override
	public boolean isNTVSporText() {
		waitSeconds(1);
		return isExist(3, spor_text);
	}
	
	@Override
	public boolean isNTVYasamImage() {
		waitSeconds(1);
		return isExist(3, yasam_image);
	}
	
	@Override
	public boolean isNTVYasamText() {
		waitSeconds(1);
		return isExist(3, yasam_text);
	}
	
	@Override
	public boolean isNTVSaglikImage() {
		waitSeconds(1);
		return isExist(3, saglik_image);
	}
	
	@Override
	public boolean isNTVSaglikText() {
		waitSeconds(1);
		return isExist(3, saglik_text);
	}
	
	@Override
	public boolean isNTVTeknolojiImage() {
		waitSeconds(1);
		return isExist(3, teknoloji_image);
	}
	
	@Override
	public boolean isNTVTeknolojiText() {
		waitSeconds(1);
		return isExist(3, teknoloji_text);
	}
	
	@Override
	public boolean isNTVEmlakImage() {
		waitSeconds(1);
		return isExist(3, emlak_image);
	}
	
	@Override
	public boolean isNTVEmlakText() {
		waitSeconds(1);
		return isExist(3, emlak_text);
	}
	
	@Override
	public boolean isNTVSanatImage() {
		waitSeconds(1);
		return isExist(3, sanat_image);
	}
	
	@Override
	public boolean isNTVSanatText() {
		waitSeconds(1);
		return isExist(3, sanat_text);
	}
	
	@Override
	public boolean isNTVOtomobilImage() {
		waitSeconds(1);
		return isExist(3, otomobil_image);
	}
	
	@Override
	public boolean isNTVOtomobilText() {
		waitSeconds(1);
		return isExist(3, otomobil_text);
	}
	
	@Override
	public boolean isNTVEgitimImage() {
		waitSeconds(1);
		return isExist(3, egitim_image);
	}
	
	@Override
	public boolean isNTVEgitimText() {
		waitSeconds(1);
		return isExist(3, egitim_text);
	}	

}
