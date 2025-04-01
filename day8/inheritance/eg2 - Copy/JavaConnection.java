package inheritance.eg2;

public class JavaConnection implements DatabseConnection{

	

	@Override
	public void connect() {
		System.out.println("Connect to database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute updated query");
		
	}

	public static void main(String[] args) {
		
	
	JavaConnection connOption = new JavaConnection();
	connOption.connect();
	connOption.executeUpdate();
	connOption.disconnect();
}}
