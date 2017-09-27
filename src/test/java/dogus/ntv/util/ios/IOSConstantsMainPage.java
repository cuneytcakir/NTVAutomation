package dogus.ntv.util.ios;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IOSConstantsMainPage extends NTVIOSConstants {

	public IOSConstantsMainPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public By deneme = By.id("AVRUPA'DA İLK GÜN KAÇ OY KULLANILDI?");	
	public By anasayfa = By.id("Ana Sayfa");
	public By turkiye = By.id("Türkiye");
	public By dunya = By.id("Dünya");
	public By ekonomi = By.id("Ekonomi");
	public By spor = By.id("Spor");
	public By yasam = By.id("Yaşam");
	public By saglik = By.id("Sağlık");
	public By teknoloji = By.id("Teknoloji");
	public By emlak = By.id("Emlak");
	public By sanat = By.id("Sanat");
	public By otomobil = By.id("Otomobil");
	public By video_galeri = By.id("Video Galeri");
	public By foto_galeri = By.id("Foto Galeri");
	public By first_news = By.xpath("/AppiumAUT/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeStaticText");
	public By turkiye_first_news = By.xpath("/AppiumAUT/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText");
	public By info_button = By.id("InfoIphoneButton");
	public By canli_yayin = By.id("LiveTvIcon");
	public By ntv_hava = By.id("NTVHavaOpenButton");

	


	

}
