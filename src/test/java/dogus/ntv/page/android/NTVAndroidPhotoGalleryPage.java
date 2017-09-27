package dogus.ntv.page.android;

import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvPhotoGalleryPage;
import dogus.ntv.util.android.NtvAndroidConstantsPhotoGallery;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidPhotoGalleryPage extends NtvAndroidConstantsPhotoGallery implements NtvPhotoGalleryPage{
	
	public NTVAndroidPhotoGalleryPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public NtvPhotoGalleryPage clickMenuPhotoGallery() {
		waitSeconds(3);
        clickAndWaitForElement(ntv_menu);
        waitSeconds(1);
        clickAndWaitForElement(menu_fotogaleri);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public NtvPhotoGalleryPage clickPGCategory() {
		waitSeconds(2);
        clickAndWaitForElement(news_category);
        waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public NtvPhotoGalleryPage clickFirstPhotoGallery() {
		waitSeconds(3);
        clickAndWaitForElement(first_photogallery);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public boolean isNTVPhotoDescription() {
		waitSeconds(3);
		return isExist(3, photo_description);
	}
	
	
	@Override
	public NtvPhotoGalleryPage getPhotoCountandSwipe() {
		waitSeconds(3);
		int a = Integer.parseInt(GetPhotoCount());
		swipeLeftMultiple(a-1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckPage() {
	    boolean x = true;
	    
	    if (GetPhotoCount() == GetPhotoCurrentPage()) {
	        x = false;
	    } 
	    else {
	        x = true;
	    }
	    return x;

	}
	
	@Override
	public NtvPhotoGalleryPage clickCategoryTurkiye() {
		waitSeconds(3);
        clickAndWaitForElement(turkiye_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryTurkiye() {
		waitSeconds(3);
		return isExist(3, category_turkiye);
	}
	
	@Override
	public NtvPhotoGalleryPage clickCategoryDunya() {
		waitSeconds(3);
        clickAndWaitForElement(dunya_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryDunya() {
		waitSeconds(3);
		return isExist(3, category_dunya);
	}
	
	
	@Override
	public NtvPhotoGalleryPage clickCategoryEkonomi() {
		waitSeconds(3);
        clickAndWaitForElement(ekonomi_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryEkonomi() {
		waitSeconds(3);
		return isExist(3, category_ekonomi);
	}
	
	@Override
	public NtvPhotoGalleryPage clickCategoryYasam() {
		waitSeconds(3);
        clickAndWaitForElement(yasam_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryYasam() {
		waitSeconds(3);
		return isExist(3, category_yasam);
	}
	
	@Override
	public NtvPhotoGalleryPage clickCategoryTeknoloji() {
		waitSeconds(3);
        clickAndWaitForElement(teknoloji_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategoryTeknoloji() {
		waitSeconds(3);
		return isExist(3, category_teknoloji);
	}
	
	@Override
	public NtvPhotoGalleryPage clickCategorySanat() {
		waitSeconds(3);
        clickAndWaitForElement(sanat_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
	}
	
	@Override
	public boolean ischeckCategorySanat() {
		waitSeconds(3);
		return isExist(3, category_sanat);
	}
	
	@Override
	public NtvPhotoGalleryPage clickCategoryEgitim() {
		waitSeconds(3);
        clickAndWaitForElement(egitim_text);
		waitSeconds(1);
		return PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class);
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
	
}
