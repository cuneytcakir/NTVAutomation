package dogus.ntv.page;

public interface NtvNewsPage {
	
	public boolean isNTVNewsPage();
	public NtvNewsPage clickCategory();
	public NtvNewsPage clickNews();
	public NtvNewsPage getNewstitle();
	public NtvNewsPage swipeUp();
	public NtvNewsPage swipeUpCategory();
	public boolean isNTVNewsImage();
	public boolean isNTVHeaderNewsImage();
	public NtvNewsPage swipeUpToBottom();
	public boolean isNTVAnasayfaImage();
	public boolean isNTVAnasayfaText();
	boolean isNTVTurkiyeImage();
	boolean isNTVTurkiyeText();
	boolean isNTVDunyaImage();
	boolean isNTVDunyaText();
	boolean isNTVEkonomiImage();
	boolean isNTVEkonomiText();
	boolean isNTVSporImage();
	boolean isNTVSporText();
	boolean isNTVYasamImage();
	boolean isNTVYasamText();
	boolean isNTVSaglikImage();
	boolean isNTVSaglikText();
	boolean isNTVTeknolojiImage();
	boolean isNTVTeknolojiText();
	boolean isNTVEmlakText();
	boolean isNTVEmlakImage();
	boolean isNTVSanatImage();
	boolean isNTVSanatText();
	boolean isNTVOtomobilImage();
	boolean isNTVOtomobilText();
	boolean isNTVEgitimImage();
	boolean isNTVEgitimText();
	NtvNewsPage clickCategoryTurkiye();
	NtvNewsPage clickCategoryDunya();
	NtvNewsPage clickCategoryEkonomi();
	NtvNewsPage clickCategorySpor();
	NtvNewsPage clickCategoryYasam();
	NtvNewsPage clickCategorySaglik();
	NtvNewsPage clickCategoryTeknoloji();
	NtvNewsPage clickCategoryEmlak();
	NtvNewsPage clickCategorySanat();
	NtvNewsPage clickCategoryOtomobil();
	NtvNewsPage clickCategoryEgitim();
	boolean ischeckCategoryTurkiye();
	boolean ischeckCategoryDunya();
	boolean ischeckCategoryEkonomi();
	boolean ischeckCategorySpor();
	boolean ischeckCategoryYasam();
	boolean ischeckCategorySaglik();
	boolean ischeckCategoryTeknoloji();
	boolean ischeckCategoryEmlak();
	boolean ischeckCategorySanat();
	boolean ischeckCategoryOtomobil();
	boolean ischeckCategoryEgitim();
}
