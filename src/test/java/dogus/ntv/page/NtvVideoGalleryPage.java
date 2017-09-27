package dogus.ntv.page;

public interface NtvVideoGalleryPage {

	NtvVideoGalleryPage clickFirstVideoGallery();
	NtvVideoGalleryPage clickMenuVideoGallery();
	boolean isNTVVideoFrame();
	NtvVideoGalleryPage clickCategoryTurkiye();
	boolean ischeckCategoryTurkiye();
	NtvVideoGalleryPage clickCategoryDunya();
	boolean ischeckCategoryDunya();
	NtvVideoGalleryPage clickCategorySpor();
	boolean ischeckCategorySpor();
	NtvVideoGalleryPage clickCategoryTeknoloji();
	boolean ischeckCategoryTeknoloji();
	NtvVideoGalleryPage clickCategorySanat();
	boolean ischeckCategorySanat();
	NtvVideoGalleryPage clickCategoryEgitim();
	boolean ischeckCategoryEgitim();
	NtvVideoGalleryPage clickCategoryNHayat();
	boolean ischeckCategoryNHayat();
	NtvVideoGalleryPage clickCategory();
	boolean isNTVAnasayfaImage();
	boolean isNTVAnasayfaText();
	boolean isNTVTurkiyeImage();
	boolean isNTVTurkiyeText();
	boolean isNTVDunyaImage();
	boolean isNTVDunyaText();
	boolean isNTVSporImage();
	boolean isNTVSporText();
	boolean isNTVTeknolojiImage();
	boolean isNTVTeknolojiText();
	boolean isNTVSanatImage();
	boolean isNTVSanatText();
	boolean isNTVEgitimImage();
	boolean isNTVEgitimText();
	boolean isNTVNHayatImage();
	boolean isNTVNHayatText();
	NtvVideoGalleryPage SendBack();
	boolean isNTVVideoList();

}
