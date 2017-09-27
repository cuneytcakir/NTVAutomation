package dogus.ntv.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvVideoGalleryPage;


public class NTVVideoGalleryTest extends BaseTest{
	
	@Before
	public void resetApp(){
		driver.resetApp();
	}
	
	@After
	public void closeApp(){
		driver.closeApp();
	}

	
	@Test
	public void clickFirstVideoGallery(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickFirstVideoGallery();
		Assert.assertTrue("Video açılmıyor.",nvp.isNTVVideoFrame());
		
	}
	
	@Test
	public void clickFirstVideoSendBack(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickFirstVideoGallery().SendBack();
		Assert.assertTrue("Video açıldı fakat ana sayfada hata oluştu.",nvp.isNTVVideoList());
		
	}

	
	@Test
	public void checkCategoryAnasayfa(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory();
		Assert.assertTrue("VideoGaleride Anasayfa image bulunamadı.",nvp.isNTVAnasayfaImage());
		Assert.assertTrue("VideoGaleride Anasayfa text bulunamadı.",nvp.isNTVAnasayfaText());
	}
	
	@Test
	public void checkCategoryTurkiye(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory();
		Assert.assertTrue("VideoGaleride Türkiye image bulunamadı.",nvp.isNTVTurkiyeImage());
		Assert.assertTrue("VideoGaleride Türkiye text bulunamadı.",nvp.isNTVTurkiyeText());
	}
	
	@Test
	public void checkCategoryDunya(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory();
		Assert.assertTrue("VideoGaleride Dünya image bulunamadı.",nvp.isNTVDunyaImage());
		Assert.assertTrue("VideoGaleride Dünya text bulunamadı.",nvp.isNTVDunyaText());
	}
	
	@Test
	public void checkCategorySpor(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory();
		Assert.assertTrue("VideoGaleride Spor image bulunamadı.",nvp.isNTVSporImage());
		Assert.assertTrue("VideoGaleride Spor text bulunamadı.",nvp.isNTVSporText());
	}
	
	@Test
	public void checkCategoryTeknoloji(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory();
		Assert.assertTrue("VideoGaleride Teknoloji image bulunamadı.",nvp.isNTVTeknolojiImage());
		Assert.assertTrue("VideoGaleride Teknoloji text bulunamadı.",nvp.isNTVTeknolojiText());
	}
	
	@Test
	public void checkCategorySanat(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory();
		Assert.assertTrue("VideoGaleride Sanat image bulunamadı.",nvp.isNTVSanatImage());
		Assert.assertTrue("VideoGaleride Sanat text bulunamadı.",nvp.isNTVSanatText());
	}
	
	@Test
	public void checkCategoryEgitim(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory();
		Assert.assertTrue("VideoGaleride Eğitim image bulunamadı.",nvp.isNTVEgitimImage());
		Assert.assertTrue("VideoGaleride Eğitim text bulunamadı.",nvp.isNTVEgitimText());
	}
	
	@Test
	public void checkCategoryNHayat(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory();
		Assert.assertTrue("VideoGaleride N Hayat image bulunamadı.",nvp.isNTVEgitimImage());
		Assert.assertTrue("VideoGaleride N Hayat text bulunamadı.",nvp.isNTVEgitimText());
	}
	
	@Test
	public void clickCategoryTurkiye(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory().clickCategoryTurkiye();
		Assert.assertTrue("VideoGaleri kategoride Türkiye yazısı görülemedi.",nvp.ischeckCategoryTurkiye());
		
	}
	
	@Test
	public void clickCategoryDunya(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory().clickCategoryDunya();
		Assert.assertTrue("VideoGaleri kategoride Dünya yazısı görülemedi.",nvp.ischeckCategoryDunya());
		
	}
	
	@Test
	public void clickCategorySpor(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory().clickCategorySpor();
		Assert.assertTrue("VideoGaleri kategoride Spor yazısı görülemedi.",nvp.ischeckCategorySpor());
		
	}
	
	@Test
	public void clickCategoryTeknoloji(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory().clickCategoryTeknoloji();
		Assert.assertTrue("VideoGaleri kategoride Teknoloji yazısı görülemedi.",nvp.ischeckCategoryTeknoloji());
		
	}
	
	@Test
	public void clickCategorySanat(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory().clickCategorySanat();
		Assert.assertTrue("VideoGaleri kategoride Sanat yazısı görülemedi.",nvp.ischeckCategorySanat());
		
	}
	
	@Test
	public void clickCategoryEgitim(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory().clickCategoryEgitim();
		Assert.assertTrue("VideoGaleri kategoride Eğitim yazısı görülemedi.",nvp.ischeckCategoryEgitim());
		
	}
	
	@Test
	public void clickCategoryNHayat(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory().clickCategoryNHayat();
		Assert.assertTrue("VideoGaleri kategoride N Hayat yazısı görülemedi.",nvp.ischeckCategoryNHayat());
		
	}
	
	
}
