public class Book {

	private String bookName;
	private String author;
	private String isbn;
	private int shelfNumber;
	private int place;

	public Book(String bookName, String author, String iSBN, int shelfNumber, int place) {
		this.bookName = bookName;
		this.author = author;
		isbn = iSBN;
		this.shelfNumber = shelfNumber;
		this.place = place;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getShelfNumber() {
		return shelfNumber;
	}

	public int getPlace() {
		return place;
	}
}
