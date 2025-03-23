package week1.day3;

public class Browser {

	public void launchBrowser()
	{
	System.out.println("Browser is launched");
	}
	
	public void loadUrl()
	{
		System.out.println("Url is loaded");
	}
	
	public static void main(String[] args) {
		Browser page = new Browser();
		page.launchBrowser();
		page.loadUrl();
	}
}