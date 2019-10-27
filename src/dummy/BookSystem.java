package dummy;

import java.io.Serializable;

public class BookSystem implements Serializable {
	 private String bookTitle;
	 private String bookType;
	 private String bookAuthor;
	 private String bookPrice;
	public BookSystem(String bookTitle, String bookType, String bookAuthor, String bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookType = bookType;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "bookTitle=" + this.bookTitle + ", bookType=" + this.bookType + ", "
				+ "bookAuthor=" + this.bookAuthor+ ", bookPrice=" + this.bookPrice + "";
	}
	public String getBookTitle() {
		return this.bookTitle;
	}
	public String getBookType() {
		return this.bookType;
	}
	public String getBookAuthor() {
		return this.bookAuthor;
	}
	public String getBookPrice() {
		return this.bookPrice;
	}

}
