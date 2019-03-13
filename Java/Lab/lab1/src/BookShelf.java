public class BookShelf {
	
	Shelf shelf[];
	
	public BookShelf(int shelfNumber) {
        shelf = new Shelf[shelfNumber];
        for (int i = 0; i < shelfNumber; i++) {
            shelf[i] = new Shelf();
        }
    }
	
	public void addBook(Book book) {
        shelf[book.getShelfNumber()].addBook(book);
    }
	
	public Book removeBook(Book book){
	    return shelf[book.getShelfNumber()].removeBook(shelf[book.getShelfNumber()].books.indexOf(book));
	}
	
	public Book searchBook(String bookName){
		for(int i = 0; i < shelf.length; i++)
	        for(Book book : shelf[i].books)
	            if(book.getBookName().compareTo(bookName) == 0)
	                return book;
		return null;
	}
	
	public boolean checkShelf(int rafNo){
		if (shelf[rafNo] == null) {
			return false;
		}else{
			return true;
		}
	}
	
	public void showShelf(int rafNo) {
        System.out.println(rafNo + ". Raftaki Kitaplar...\nBook Ad�\t\t\tYazar\t\tISBN");
        for(int i = 0; i < shelf[rafNo].books.size(); i++){
            System.out.println(shelf[rafNo].books.get(i).getBookName() +
            		"\t" + shelf[rafNo].books.get(i).getAuthor() + "\t" +
            		shelf[rafNo].books.get(i).getIsbn());
        }
        System.out.println("\n\n");
    }

}
