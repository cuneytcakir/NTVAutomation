package dogus.ntv.test.ios;

import org.junit.Test;

import dogus.ntv.base.BaseTest;
import dogus.ntv.base.PageFactory;
import dogus.ntv.page.IOSMainPage;


public class IOSMainPageTest extends BaseTest{
	
	
	@Test
	public void ClickDeneme(){
		IOSMainPage mp = PageFactory.getInstance().createPage(IOSMainPage.class).isDeneme();
	}

}
