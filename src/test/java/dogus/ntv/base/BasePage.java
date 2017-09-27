package dogus.ntv.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;

public abstract class BasePage  {
	protected AppiumDriver<MobileElement> driver;
	public static final int DEFAULT_WAIT = 30;
	public BasePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	/**
	 * Native içerikten Webview içeriğe geçiş yapar. 
	 */
	
	public void contextChange(){
		Set<String> getCont=driver.getContextHandles();
        for(String switchCont : getCont){
            System.out.println("get" +switchCont);
			if(switchCont.contains("WEBVIEW")){
                driver.context(switchCont);
			    waitSeconds(10);
			}
	    }
	}
	
	/**
	 * Back işlemi yapar. 
	 */
	
	public void sendBack(){
		driver.navigate().back();
	}
	
	/**
	 * SS alma 
	 */
	
	public void Screenshot(String path_screenshot) throws IOException{
	    File srcFile=driver.getScreenshotAs(OutputType.FILE);
	    String filename=UUID.randomUUID().toString(); 
	    File targetFile=new File(path_screenshot + filename +".jpg");
	    FileUtils.copyFile(srcFile,targetFile);
	}
	
	/**
	 * Click komutunu lokasyona göre işletir, click metodunun çalışmadığı
	 * durumlarda kullanılabilir.
	 * @param seconds : Element'in aranma süresini belirler.
	 * @param elementBy : Ulaşılmak istenen elementin attribute değeri.
	 */
	public void getLocationClick(int seconds, By elementBy) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
		driver.tap(1, element, 1);
	}
	
	/**
	 * Ulaşılmak istenilen WebElement'i döndürür.
	 * @param seconds: Element'in aranma süresini belirler.
	 * @param elementBy: Ulaşılmak istenen elementin attribute değeri.
	 * @return
	 */
	public WebElement waitForElement(int seconds, By elementBy) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		return wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
	}
	
	/**
	 * Ulaşılmak istenilen MobileElement'i döndürür.
	 * @param seconds: Element'in aranma süresini belirler.
	 * @param elementBy: Ulaşılmak istenen elementin attribute değeri.
	 * @return
	 */
	public MobileElement waitForMobileElement(int seconds, By elementBy) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
	}

	/**
	 * Ulaşılmak istenilen WebElement'leri liste şeklinde döndürür.
	 * @param seconds: Element'in aranma süresini belirler.
	 * @param elementBy: Ulaşılmak istenen elementin attribute değeri.
	 * @return
	 */
	public List<WebElement> waitForElements(int seconds, By elementBy) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementBy));
	}

	/**
	 * Ulaşılmak istenilen WebElement'i döndürür.
	 * @param seconds : Element'in aranma süresini belirler.
	 * @param resourceId : Ulaşılmak istenen elementin id değeri string cinsinden.
	 * @return
	 */
	public WebElement waitForElementById(int seconds, String resourceId) {
		return waitForElement(seconds, By.id(resourceId));
	}


	public void waitForElement(int seconds, String resourceId) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(resourceId)));
	}
	
	/**
	 * Element'i bekler ve click işlemini gerçekleştirir.
	 * @param driver 
	 * @param byElement
	 * @param Seconds
	 */
	public void clickAndWaitForElement(By byElement, int Seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).click();

	}
	
	/**
	 * Element'i bekler ve click işlemini gerçekleştirir.
	 * @param driver 
	 * @param byElement
	 * @param Seconds"
	 */
	public void clickAndWaitForElement(By byElement) {
		WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).click();

	}

	public void clickAndWaitListElementAtIndex(By byList, By byElement, int index, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(byList)).findElements(byElement).get(index).click();

	}
	
	/**
	 * Element'i tıklar ve başlığı alma işlemini gerçekleştirir.
	 * @param driver 
	 * @param byElement
	 * @param Seconds"
	 */
	public void getNewsTitle(By byElement) {
		WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).getText();
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).getText());

	}

	/**
	 * Textfield alanlarına text göndermeyi sağlar. İşlem sonrası 
	 * klavyeyi gizler.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 * @param text
	 */
	public void sendKeysAndWaitForElement(By byElement, int Seconds, String text) {
		WebElement element = waitForElement(Seconds, byElement);
		element.click();
		if(driver instanceof IOSDriver){
			element.clear();
			element.sendKeys(text);
			tryHideKeyboardIOS();
		}else{
			element.sendKeys(text);
			tryHideKeyboard();
		}
	}
	
	/**
	 * Textfield alanlarına text göndermeyi sağlar. İşlem sonrası 
	 * klavyeyi gizler.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 * @param text
	 */
	public void sendKeysAndWaitForElement(By byElement, String text) {
		WebElement element = waitForElement(DEFAULT_WAIT, byElement);
		element.click();
		if(driver instanceof IOSDriver){
			element.clear();
			element.sendKeys(text);
			tryHideKeyboardIOS();
		}else{
			element.sendKeys(text);
			tryHideKeyboard();
		}
	}
	
	/**
	 * Textfield alanlarına text göndermeyi sağlar, list halindeli elementleri index
	 * ile bulur. İşlem sonrası klavyeyi gizler.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 * @param text
	 * @param index : liste halindeki elementlerin index değeri.
	 */
	public void sendKeysAndWaitForElements(By byElement, int Seconds, String text, int index) {
		WebElement element = waitForElements(DEFAULT_WAIT, byElement).get(index);
		element.click();
		if(driver instanceof IOSDriver)
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Textfield alanlarına text göndermeyi sağlar. Klavyenin
	 * gizlenmemesi istenildiğinde kullanılır.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 * @param text
	 */
	public void sendKeysAndWaitForElementNotHideKeyboard(By byElement, int Seconds, String text) {
		WebElement element = waitForElement(DEFAULT_WAIT, byElement);
		element.click();
		if(driver instanceof IOSDriver)
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Textfield alanlarındaki değeri siler.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 */
	public void clearAndWaitForElement(By byElement, int Seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).clear();
	}

	/**
	 * Belirtilen saniye boyunca bir sonraki işleme kadar bekler.
	 * @param seconds
	 */
	public void waitSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Aldığı parametre sayısınca sola swipe eder.
	 * @param repeat
	 */
	public void swipeLeftMultiple(int repeat) {
		for (int i = 0; i < repeat; i++) {
			swipeLeftAccordingToPhoneSize();
			waitSeconds(1);
		}
	}
	
	/**
	 * Aldığı parametre sayısınca yukarı swipe eder.
	 * @param repeat
	 */
	public void swipeUpMultiple(int repeat) {
		for (int i = 0; i < repeat; i++) {
			swipeUpAccordingToPhoneSize();
			waitSeconds(1);
		}
	}
	

	/**
	 * Sola swipe eder. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeLeftAccordingToPhoneSize() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = (width * 90) / 100;
		int swipeEndWidth = (width * 5) / 100;
		int swipeStartHeight = height / 3, swipeEndHeight = height / 3;

//		System.out.println("height= " + height + " width= " + width);
//		System.out.println("start= " + swipeStartWidth + " end= " + swipeEndWidth);

		driver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

	}
	
	/**
	 * Sağa swipe eder. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeRightAccordingToPhoneSize() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = (width * 50) / 100;
		int swipeEndWidth = (width * 90) / 100;
		int swipeStartHeight = height / 3, swipeEndHeight = height / 3;

//		System.out.println("height= " + height + " width= " + width);
//		System.out.println("start= " + swipeStartWidth + " end= " + swipeEndWidth);

		driver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

	}
	
	/**
	 * Aşağıya swipe eder. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeDownAccordingToPhoneSize() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = width / 2, swipeEndWidth = width / 2;

		int swipeStartHeight = (height * 80) / 100;
		int swipeEndHeight = (height * 30) / 100;

		driver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

	}
	
	/**
	 * Yukarıya swipe eder. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeUpAccordingToPhoneSize() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = width / 2, swipeEndWidth = width / 2;

		int swipeStartHeight = (height * 10) / 100;
		int swipeEndHeight = (height * 90) / 100;

		driver.swipe(swipeStartWidth, swipeEndHeight, swipeEndWidth, swipeStartHeight , 1000);

	}
	
	/**
	 * Aşağıya swipe eder ve notification açılır.. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeDownandOpenNotif() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = width / 2, swipeEndWidth = width / 2;

		int swipeStartHeight = (height * 2) / 100;
		int swipeEndHeight = (height * 50) / 100;

		driver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

	}
	
	
	/**
	 * Combobox elementinden indexine göre seçim yapmayı sağlar.
	 * @param driver
	 * @param seconds
	 * @param index
	 * @param byElement
	 */
	public void selectElementFromCombobox(int seconds, int index, By byElement) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		Select oSelection = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(byElement)));
	    oSelection.selectByIndex(index);
	}

	/**
	 * Element bazlı sola swipe işlemi yapar.
	 * @param byElement
	 */
	public void swipeLeftById(By byElement){
		MobileElement element =(MobileElement)driver.findElement(byElement);
		element.swipe(SwipeElementDirection.LEFT, 400);
	}
	
	/**
	 * Element bazlı yukarıya swipe işlemi yapar.
	 * @param byElement
	 */
	public void swipeUpById(By byElement){
		MobileElement element =(MobileElement)driver.findElement(byElement);
		element.swipe(SwipeElementDirection.UP, 400);
	}
	
	/**
	 * Aldığı parametre sayısınca element bazlı yukarı swipe eder.
	 * @param repeat
	 */
	public void swipeUpByIdMultiple(int repeat) {
		for (int i = 0; i < repeat; i++) {
			swipeUpAccordingToPhoneSize();
			waitSeconds(1);
		}
	}
	
	/**
	 * Default IOS HideKeyboard metodu her durumda doğru çalışmadığı 
	 * için geliştirilmiş metodtur. Default metodta ekranın ortasına
	 * tıklayıp klavyeyi kapatmakta fakat tıkladığı alanda buton
	 * veya textfield gibi bir element var ise onlara aksiyon sağladığı
	 * için işlem başarısız olmakta bu sebeple element bulunmayacağı 
	 * tahmin edilen noktaya göre klavye gizleme işlemi sağlanmıştır.
	 */
	public void tryHideKeyboardIOS(){
		try {
			Dimension d = driver.manage().window().getSize();
			int height = d.height;
			int width = d.width;
			
			driver.tap(2, width-1, height/2,  1);
		} catch (Exception e) {
		}
		
	}
	
	/**
	 * Appium default klavye gizleme işlemidir. Android
	 * platformunda stabil çalışırken IOS platformunda 
	 * stabil çalışmamaktadır.
	 */
	public void tryHideKeyboard(){
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
		}
		
	}
	
	/**
	 * Testin çalıştığı telefonun boyutlarını yazdıran metod.
	 */
	public void getPhoneSize(){
		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;
		System.out.println("height : "+ height+"\nwidth : "+ width);
	}
	
	/**
	 * Element'in varlığını kontrol eder, parametre ile belirtilen 
	 * süre boyunca elementi bulursa true bulamaz ise false döner
	 * bu sayede assertion kontrolü sağlanır. 
	 * @param seconds
	 * @param by
	 * @return
	 */
	public boolean isExist(int seconds,By by){
		try {
			waitForElement(seconds, by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Web Element'in attribute değerini konsol a basar.
	 * @param element
	 */
	public void foundedElement(WebElement element){
		System.out.println("Founded element ->"+element.toString().split("->")[1]);
	}
	
	/**
	 * Mobil Element'in toplam sayfa sayısını konsol a basar.
	 * @param element
	 */
	public String GetPhotoCount(){
		return driver.findElementById("com.dogus.ntv:id/pageNumber").getText().substring(4);
	}
	
	/**
	 * Mobil Element'in geldiği son sayfa değerini konsol a basar.
	 * @param element
	 */
	public String GetPhotoCurrentPage(){
		return driver.findElementById("com.dogus.ntv:id/pageNumber").getText().substring(0, 1); 
	}
	
	/**
	 * Mobil Element'in text değerini basar.
	 * @param element
	 */
	public String GetElementText(String id){
		return driver.findElementById("com.dogus.ntv:id/"+ id).getText(); 
	}
	
	/**
	 * Mobil Element'in selected değerini basar.
	 * @param element
	 */
	public boolean GetElementSelected(String id){
		return driver.findElement(By.id("com.dogus.ntv:id/"+ id)).isSelected();
	}
	
	
}



