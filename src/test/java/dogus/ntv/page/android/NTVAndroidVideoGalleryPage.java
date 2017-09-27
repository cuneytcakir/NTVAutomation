package dogus.ntv.page.android;


import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvVideoGalleryPage;
import dogus.ntv.util.android.NtvAndroidConstantsVideoGallery;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidVideoGalleryPage extends NtvAndroidConstantsVideoGallery implements NtvVideoGalleryPage{

	public NTVAndroidVideoGalleryPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isNTVVideoFrame() {
		waitSeconds(3);
		return isExist(3, video_frame);
	}
	
	@Override
	public boolean isNTVVideoList() {
		waitSeconds(3);
		return isExist(3, video_list);
	}
	
	@Override
	public NtvVideoGalleryPage clickMenuVideoGallery() {
		waitSeconds(3);
        clickAndWaitForElement(ntv_menu);
        waitSeconds(1);
        clickAndWaitForElement(menu_videogaleri);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public NtvVideoGalleryPage SendBack() {
		waitSeconds(3);
		sendBack();
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public NtvVideoGalleryPage clickFirstVideoGallery() {
		waitSeconds(3);
        clickAndWaitForElement(first_videogallery);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public NtvVideoGalleryPage clickCategory() {
		waitSeconds(3);
        clickAndWaitForElement(news_category);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public NtvVideoGalleryPage clickCategoryTurkiye() {
		waitSeconds(3);
        clickAndWaitForElement(turkiye_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryTurkiye() {
		waitSeconds(3);
		return isExist(3, category_turkiye);
	}
	
	@Override
	public NtvVideoGalleryPage clickCategoryDunya() {
		waitSeconds(3);
        clickAndWaitForElement(dunya_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryDunya() {
		waitSeconds(3);
		return isExist(3, category_dunya);
	}
	
	
	@Override
	public NtvVideoGalleryPage clickCategorySpor() {
		waitSeconds(3);
        clickAndWaitForElement(spor_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategorySpor() {
		waitSeconds(3);
		return isExist(3, category_spor);
	}
	
	@Override
	public NtvVideoGalleryPage clickCategoryTeknoloji() {
		waitSeconds(3);
        clickAndWaitForElement(teknoloji_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryTeknoloji() {
		waitSeconds(3);
		return isExist(3, category_teknoloji);
	}
	
	@Override
	public NtvVideoGalleryPage clickCategorySanat() {
		waitSeconds(3);
        clickAndWaitForElement(sanat_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategorySanat() {
		waitSeconds(3);
		return isExist(3, category_sanat);
	}
	
	@Override
	public NtvVideoGalleryPage clickCategoryEgitim() {
		waitSeconds(3);
        clickAndWaitForElement(egitim_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryEgitim() {
		waitSeconds(3);
		return isExist(3, category_egitim);
	}
	
	@Override
	public NtvVideoGalleryPage clickCategoryNHayat() {
		waitSeconds(3);
        clickAndWaitForElement(nhayat_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvVideoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryNHayat() {
		waitSeconds(3);
		return isExist(3, category_nhayat);
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
	public boolean isNTVEgitimImage() {
		waitSeconds(1);
		return isExist(3, egitim_image);
	}
	
	@Override
	public boolean isNTVEgitimText() {
		waitSeconds(1);
		return isExist(3, egitim_text);
	}	
	
	@Override
	public boolean isNTVNHayatImage() {
		waitSeconds(1);
		return isExist(3, nhayat_image);
	}
	
	@Override
	public boolean isNTVNHayatText() {
		waitSeconds(1);
		return isExist(3, nhayat_text);
	}
	
}
