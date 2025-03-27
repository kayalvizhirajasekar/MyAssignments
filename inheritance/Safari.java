package inheritance;

public class Safari extends Edge{

	public void readerMode() {
		System.out.println("Reader mode");
	}
	
	public void fullScreenMode() {
		System.out.println("Full screen mode");
	}
	
	public static void main(String[] args) {

		Safari safariOption = new Safari();
		safariOption.readerMode();
		safariOption.fullScreenMode();
		
		safariOption.clearCookies();
		safariOption.takeSnap();
		
		safariOption.clearCache();
		safariOption.openIncognito();
		
		safariOption.closeBrowser();
		safariOption.openUrl();
		safariOption.closeBrowser();
		
		System.out.println(safariOption.browserName);
		System.out.println(safariOption.browserVersion);
	}

}
