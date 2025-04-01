package inheritance;

public class Browser {

	
	String browserName = "leaftaps";
	float browserVersion = 10.2F;
	
	public void openUrl() {
		System.out.println("Open Url");
	}
	
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	
	public void navigateBack() {
		System.out.println("Navigate back");
	}
	
	public static void main(String[] args) {
		

		Browser browserOption = new Browser();
		browserOption.openUrl();
		browserOption.closeBrowser();
		browserOption.navigateBack();
	}

}
