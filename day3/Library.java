package week1.day3;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully: " + bookTitle);
		return bookTitle; // Returning book title
	}

	// Method to issue a book
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	// Main method for execution
	public static void main(String[] args) {
		// Creating an object of Library class
		Library myLibrary = new Library();

		// Calling methods
		myLibrary.addBook("Java Programming");
		myLibrary.issueBook();
	}

}
