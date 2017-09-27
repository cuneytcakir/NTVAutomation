package dogus.ntv.page;

import dogus.ntv.page.android.NTVAndroidNewsDetailPage;

public interface NtvNewsDetailPage {
	
	public boolean isNTVtitiliumCheck();
	public NTVAndroidNewsDetailPage swipeNewsDetail();
	public NTVAndroidNewsDetailPage getNewsDetailtitle();
	public boolean isNTVAdsCheck();
	public boolean isNTVEngageyaCheck();

}
