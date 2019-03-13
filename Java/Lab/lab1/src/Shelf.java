import java.util.LinkedList;

public class Shelf {
	
	LinkedList<Book> books;

	public Shelf() {
		this.books = new LinkedList<Book>();
	}
	
	public void addBook(Book book){
        this.books.add(book);
    }
	
	public Book removeBook(int index){
        Book book;
        book = this.books.remove(index);
        return book;
    }
	
}
