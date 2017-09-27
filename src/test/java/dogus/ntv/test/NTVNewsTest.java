package dogus.ntv.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvNewsDetailPage;
import dogus.ntv.page.NtvNewsPage;

public class NTVNewsTest extends BaseTest{
	
	@Before
	public void resetApp(){
		driver.resetApp();
	}
	
	@After
	public void closeApp(){
		driver.closeApp();
	}

	
	@Test
	public void checkNewsPage(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class);
		Assert.assertTrue("Haberler sayfası açılmıyor.",np.isNTVNewsPage());
		
	}
	
	@Test
	public void clickFirstNews(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickNews();
		NtvNewsDetailPage ndp = PageFactory.getInstance().createPage(NtvNewsDetailPage.class);
		Assert.assertTrue("Haber detay sayfası açılmıyor.", ndp.isNTVtitiliumCheck());
		
	}
	
	@Test
	public void swipeNews(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickNews();
		String a = driver.findElementById("com.dogus.ntv:id/titiliumTextSection").getText();
		NtvNewsDetailPage ndp = PageFactory.getInstance().createPage(NtvNewsDetailPage.class).swipeNewsDetail();
		String b = driver.findElementById("com.dogus.ntv:id/titiliumTextSection").getText();
		
		if (a == b) {
			Assert.fail("Sayfa swipe olmadı");
		}
	}
	
	@Test
	public void swipeUpNews(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).swipeUp();
		Assert.assertTrue("Haberler sayfası swipe olmadı.",np.isNTVNewsImage());
		
	}
	
	@Test
	public void checkNewsAds(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickNews().swipeUpToBottom();
		NtvNewsDetailPage ndp = PageFactory.getInstance().createPage(NtvNewsDetailPage.class);
		Assert.assertTrue("Haber detay sayfasında reklam gelmedi.", ndp.isNTVAdsCheck());
		
	}
	
	@Test
	public void checkEngageyaList(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickNews().swipeUpToBottom();
		NtvNewsDetailPage ndp = PageFactory.getInstance().createPage(NtvNewsDetailPage.class);
		Assert.assertTrue("Haber detay sayfasında engageya haberleri gelmedi.", ndp.isNTVEngageyaCheck());
		
	}
	
	@Test
	public void checkCategoryAnasayfa(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Anasayfa image bulunamadı.",np.isNTVAnasayfaImage());
		Assert.assertTrue("Anasayfa text bulunamadı.",np.isNTVAnasayfaText());
	}
	
	@Test
	public void checkCategoryTurkiye(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Türkiye image bulunamadı.",np.isNTVTurkiyeImage());
		Assert.assertTrue("Türkiye text bulunamadı.",np.isNTVTurkiyeText());
	}
	
	@Test
	public void checkCategoryDunya(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Dünya image bulunamadı.",np.isNTVDunyaImage());
		Assert.assertTrue("Dünya text bulunamadı.",np.isNTVDunyaText());
	}
	
	@Test
	public void checkCategoryEkonomi(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Ekonomi image bulunamadı.",np.isNTVEkonomiImage());
		Assert.assertTrue("Ekonomi text bulunamadı.",np.isNTVEkonomiText());
	}
	
	@Test
	public void checkCategorySpor(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Spor image bulunamadı.",np.isNTVSporImage());
		Assert.assertTrue("Spor text bulunamadı.",np.isNTVSporText());
	}
	
	@Test
	public void checkCategoryYaşam(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Yaşam image bulunamadı.",np.isNTVYasamImage());
		Assert.assertTrue("Yaşam text bulunamadı.",np.isNTVYasamText());
	}
	
	@Test
	public void checkCategorySağlık(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Sağlık image bulunamadı.",np.isNTVSaglikImage());
		Assert.assertTrue("Sağlık text bulunamadı.",np.isNTVSaglikText());
	}
	
	@Test
	public void checkCategoryTeknoloji(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Teknoloji image bulunamadı.",np.isNTVTeknolojiImage());
		Assert.assertTrue("Teknoloji text bulunamadı.",np.isNTVTeknolojiText());
	}
	
	@Test
	public void checkCategoryEmlak(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Emlak image bulunamadı.",np.isNTVEmlakImage());
		Assert.assertTrue("Emlak text bulunamadı.",np.isNTVEmlakText());
	}
	
	@Test
	public void checkCategorySanat(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory();
		Assert.assertTrue("Sanat image bulunamadı.",np.isNTVSanatImage());
		Assert.assertTrue("Sanat text bulunamadı.",np.isNTVSanatText());
	}
	
	@Test
	public void checkCategoryOtomobil(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory().swipeUpCategory();
		Assert.assertTrue("Otomobil image bulunamadı.",np.isNTVOtomobilImage());
		Assert.assertTrue("Otomobil text bulunamadı.",np.isNTVOtomobilText());
	}
	
	@Test
	public void checkCategoryEgitim(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory().swipeUpCategory();
		Assert.assertTrue("Eğitim image bulunamadı.",np.isNTVEgitimImage());
		Assert.assertTrue("Eğitim text bulunamadı.",np.isNTVEgitimText());
	}
	
	@Test
	public void clickCategoryTurkiye(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategoryTurkiye();
		Assert.assertTrue("Menüde Türkiye yazısı görülemedi.",np.ischeckCategoryTurkiye());
		
	}
	
	@Test
	public void clickCategoryDunya(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategoryDunya();
		Assert.assertTrue("Menüde Dünya yazısı görülemedi.",np.ischeckCategoryDunya());
		
	}
	
	@Test
	public void clickCategoryEkonomi(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategoryEkonomi();
		Assert.assertTrue("Menüde Ekonomi yazısı görülemedi.",np.ischeckCategoryEkonomi());
		
	}
	
	@Test
	public void clickCategorySpor(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategorySpor();
		Assert.assertTrue("Menüde Spor yazısı görülemedi.",np.ischeckCategorySpor());
		
	}
	
	@Test
	public void clickCategoryYasam(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategoryYasam();
		Assert.assertTrue("Menüde Yaşam yazısı görülemedi.",np.ischeckCategoryYasam());
		
	}
	
	@Test
	public void clickCategorySaglik(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategorySaglik();
		Assert.assertTrue("Menüde Sağlık yazısı görülemedi.",np.ischeckCategorySaglik());
		
	}
	
	@Test
	public void clickCategoryTeknoloji(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategoryTeknoloji();
		Assert.assertTrue("Menüde Teknoloji yazısı görülemedi.",np.ischeckCategoryTeknoloji());
		
	}
	
	@Test
	public void clickCategoryEmlak(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategoryEmlak();
		Assert.assertTrue("Menüde Emlak yazısı görülemedi.",np.ischeckCategoryEmlak());
		
	}
	
	@Test
	public void clickCategorySanat(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.clickCategorySanat();
		Assert.assertTrue("Menüde Sanat yazısı görülemedi.",np.ischeckCategorySanat());
		
	}
	
	@Test
	public void clickCategoryOtomobil(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.swipeUpCategory().clickCategoryOtomobil();
		Assert.assertTrue("Menüde Otomobil yazısı görülemedi.",np.ischeckCategoryOtomobil());
		
	}
	
	@Test
	public void clickCategoryEgitim(){
		NtvNewsPage np = PageFactory.getInstance().createPage(NtvNewsPage.class).clickCategory()
		.swipeUpCategory().clickCategoryEgitim();
		Assert.assertTrue("Menüde Eğitim yazısı görülemedi.",np.ischeckCategoryEgitim());
		
	}

}
