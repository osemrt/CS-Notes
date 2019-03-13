import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		int shelfNumber = 5;
		
		BookShelf bookShelf = new BookShelf(shelfNumber);
		
		Book book1, book2, book3;
		
		book1 = new Book("Pera Palas'ta Gece Yar�s�", "Charles King", "978-605-105-148-2", 1, 1);
        book2 = new Book("Ali Em�r�'nin �zinde     ", "M. Serhan Tay�i", "978-975-263-956-0", 1, 0);
        book3 = new Book("Bir T�rk Ailesinin �yk�s�", "�rfan Orga", "978-975-289-567-6", 2, 2);
        
        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        
        bookShelf.showShelf(0);
        bookShelf.showShelf(1);
        bookShelf.removeBook(book1);
        bookShelf.showShelf(1);
        bookShelf.showShelf(2);
        
		Scanner scanner = new Scanner(System.in);
		int no;
		
		do{
            System.out.println("Shelf no: ");
            no = scanner.nextInt();
        }while(!bookShelf.checkShelf(no));
		
		bookShelf.showShelf(no);
		
		scanner.close();
	}

}
