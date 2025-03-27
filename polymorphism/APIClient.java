package polymorphism;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("String for the endpoint" + " " + endpoint);
	}
	
	public void sendRequest(String endpoint, String requestbody, boolean requestStatus) {
		System.out.println("Mention the endpoint : " +" "+ endpoint);
		System.out.println("Enter request body : " + " " + requestbody);
		System.out.println("requestStatus is successful : " + " " + requestStatus);
		}
		
	public static void main(String[] args) {
		APIClient apiOption = new APIClient();
		apiOption.sendRequest("https://google.com");
		apiOption.sendRequest("https://fb.com", "soap body", true);

	}

}
