package dogus.ntv.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvPhotoGalleryPage;
import dogus.ntv.page.NtvVideoGalleryPage;


public class NTVPhotoGalleryTest extends BaseTest{
	
	@Before
	public void resetApp(){
		driver.resetApp();
	}
	
	@After
	public void closeApp(){
		driver.closeApp();
	}
	
	@Test
	public void clickFirstPhotoGallery(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickFirstPhotoGallery();
		Assert.assertTrue("Foto Galeri açılmıyor.",npg.isNTVPhotoDescription());
		
	}
	
	@Test
	public void swipePhotoGallery(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickFirstPhotoGallery().getPhotoCountandSwipe();		
		Assert.assertTrue("Foto Galeri son sayfaya swipe olmuyor.",npg.ischeckPage());
			
	}
	
	@Test
	public void checkCategoryAnasayfa(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory();
		Assert.assertTrue("Anasayfa image bulunamadı.",npg.isNTVAnasayfaImage());
		Assert.assertTrue("Anasayfa text bulunamadı.",npg.isNTVAnasayfaText());
	}
	
	@Test
	public void checkCategoryTurkiye(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory();
		Assert.assertTrue("Türkiye image bulunamadı.",npg.isNTVTurkiyeImage());
		Assert.assertTrue("Türkiye text bulunamadı.",npg.isNTVTurkiyeText());
	}
	
	@Test
	public void checkCategoryDunya(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory();
		Assert.assertTrue("Dünya image bulunamadı.",npg.isNTVDunyaImage());
		Assert.assertTrue("Dünya text bulunamadı.",npg.isNTVDunyaText());
	}
	
	@Test
	public void checkCategoryEkonomi(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory();
		Assert.assertTrue("Ekonomi image bulunamadı.",npg.isNTVEkonomiImage());
		Assert.assertTrue("Ekonomi text bulunamadı.",npg.isNTVEkonomiText());
	}
	
	@Test
	public void checkCategoryYasam(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory();
		Assert.assertTrue("Yaşam image bulunamadı.",npg.isNTVYasamImage());
		Assert.assertTrue("Yaşam text bulunamadı.",npg.isNTVYasamText());
	}
	
	@Test
	public void checkCategorySanat(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory();;
		Assert.assertTrue("Sanat image bulunamadı.",npg.isNTVSanatImage());
		Assert.assertTrue("Sanat text bulunamadı.",npg.isNTVSanatText());
	}
	
	@Test
	public void checkCategoryEgitim(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory();
		Assert.assertTrue("Eğitim image bulunamadı.",npg.isNTVEgitimImage());
		Assert.assertTrue("Eğitim text bulunamadı.",npg.isNTVEgitimText());
	}
	
	@Test
	public void checkCategoryTeknoloji(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory();;
		Assert.assertTrue("Teknoloji image bulunamadı.",npg.isNTVTeknolojiImage());
		Assert.assertTrue("Teknoloji text bulunamadı.",npg.isNTVTeknolojiText());
	}
	
	@Test
	public void clickCategoryTurkiye(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory().clickCategoryTurkiye();
		Assert.assertTrue("FotoGaleri Kategoride Türkiye yazısı görülemedi.",npg.ischeckCategoryTurkiye());
		
	}
	
	@Test
	public void clickCategoryDunya(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory().clickCategoryDunya();
		Assert.assertTrue("FotoGaleri Kategoride Dünya yazısı görülemedi.",npg.ischeckCategoryDunya());
		
	}
	
	@Test
	public void clickCategoryEkonomi(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory().clickCategoryEkonomi();
		Assert.assertTrue("FotoGaleri Kategoride Ekonomi yazısı görülemedi.",npg.ischeckCategoryEkonomi());
		
	}
	
	@Test
	public void clickCategoryYasam(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory().clickCategoryYasam();
		Assert.assertTrue("FotoGaleri Kategoride Yaşam yazısı görülemedi.",npg.ischeckCategoryYasam());
		
	}
	
	@Test
	public void clickCategoryTeknoloji(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory().clickCategoryTeknoloji();
		Assert.assertTrue("FotoGaleri Kategoride Teknoloji yazısı görülemedi.",npg.ischeckCategoryTeknoloji());
		
	}
	
	@Test
	public void clickCategorySanat(){
		NtvPhotoGalleryPage npg = PageFactory.getInstance().createPage(NtvPhotoGalleryPage.class)
		.clickMenuPhotoGallery().clickPGCategory().clickCategorySanat();
		Assert.assertTrue("FotoGaleri Kategoride Sanat yazısı görülemedi.",npg.ischeckCategorySanat());
		
	}
	
	@Test
	public void clickCategoryEgitim(){
		NtvVideoGalleryPage nvp = PageFactory.getInstance().createPage(NtvVideoGalleryPage.class)
		.clickMenuVideoGallery().clickCategory().clickCategoryEgitim();
		Assert.assertTrue("FotoGaleri Kategoride Eğitim yazısı görülemedi.",nvp.ischeckCategoryEgitim());
		
	}


}
