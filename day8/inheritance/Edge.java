package inheritance;

public class Edge extends Chrome{

	public void takeSnap() {
		System.out.println("Take snapshot");
	}
	
	public void clearCookies() {
		System.out.println("Clear cookies");
	}
	
	public static void main(String[] args) {

		Edge edgeOption = new Edge();
		edgeOption.takeSnap();
		edgeOption.clearCookies();
		
		edgeOption.openIncognito();
		edgeOption.clearCache();
		
		edgeOption.openUrl();
		edgeOption.navigateBack();
		edgeOption.closeBrowser();
	}

}
