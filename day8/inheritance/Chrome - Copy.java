package inheritance;

public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("Open incognito mode");
	}
	
	public void clearCache() {
		System.out.println("Clear the cache");
	}
	
	public static void main(String[] args) {
		
		Chrome chromeOption = new Chrome();
		chromeOption.openIncognito();
		chromeOption.clearCache();
		
		chromeOption.openUrl();
		chromeOption.navigateBack();
		chromeOption.closeBrowser();
		
	}

}
