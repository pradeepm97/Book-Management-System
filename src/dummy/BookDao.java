package dummy;
public interface BookDao {
	public BookSystem addBook(BookSystem rv);
	public BookSystem searchBasedOnBookTitle(String bookTitle);
	public BookSystem searchBasedOnBookAuthor(String bookAuthor);
	public BookSystem searchBasedOnBookType(String bookType);
}

