package dummy;

public class BookFactory {
	public static BookDao getAccessToDaoimp(){
		BookDao daob=new BookDaoimp();
		return daob;
	}

}
