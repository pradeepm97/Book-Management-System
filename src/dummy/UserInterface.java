package dummy;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface {
	public static void inputValidation(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("1:Add a new book.......");
		System.out.println("2:Search Book Based on Title......");
		System.out.println("3.Search Book Based on Author.....");
		System.out.println("4:Search Book Based on Type......");
		System.out.println();
		System.out.print(">>Choose any option in above   :");
		String userSelectedValue=scanner.nextLine();
		switch(userSelectedValue){
		case "1": addbook();
		            break;
		case "2":searchBasedOnTitle();
		            break;
		case "3":searchBasedOnAuthor();
		            break;
		case "4":searchBasedOnType();
		           break;
		default: System.out.println("your option is  not valid"); 
		Controler.repetative();
		           break;
		}
		}
	public static void addbook(){
								boolean status;
								String booktitle;
								String booktype;
								String bookauthor;
								  String bookprice;
								System.out.println();
								System.out.println("<:)You enterd option 1, to add the book please fill the Below Details.");
								Scanner scanner=new Scanner(System.in);
								 do {
									   System.out.print("Enter BOOK TITLE (it should be A-z or a-z) :");
									   booktitle=scanner.nextLine();
							    	   status= Checking.validateTitle(booktitle);
							    }while(!status);
								 do {
							    System.out.print("Enter BOOK TYPE (it should be A-z o	r a-z) :");	
							    booktype=scanner.nextLine();
							    status= Checking.validateTitle(booktype);
								 }while(!status);
								 do {
							    System.out.print("Enter BOOK AUTHOR (it should be A-z or a-z)  :");
							     bookauthor=scanner.nextLine();
							    status= Checking.validateauthor(bookauthor);
								 }while(!status);
								 do {
							   System.out.print("Enter BOOK PRICE (it should be A-z or a-z)  :");
							    bookprice=scanner.nextLine();  
							   status= Checking.validateprice(bookprice);
								 }while(!status);
							   BookSystem bookSystem =new BookSystem(booktitle, booktype, bookauthor, bookprice);
								BookDao bookDao=new BookDaoimp();
								bookDao.addBook(bookSystem);
								System.out.println(":>)your book Added successfully");
								Controler.repetative();
	}
	    public static void searchBasedOnTitle() 
	    {
								Scanner scanner=new Scanner(System.in);
								System.out.print("Enter the Title of Book :");
						        String searchTitle=scanner.nextLine();
						        BookDao bookDao=new BookDaoimp();
						        BookSystem result=bookDao.searchBasedOnBookTitle(searchTitle);
						        System.out.println(result);
						        Controler.repetative();
	    }
	    public static void searchBasedOnAuthor()
	    {
								 Scanner scanner=new Scanner(System.in);
								 System.out.print("Enter book Author Name:");
								 String Searchauthor=scanner.nextLine();
								 BookDao bookDao=new BookDaoimp();
								 BookSystem result=bookDao.searchBasedOnBookAuthor(Searchauthor);
								 System.out.println(result);
								 Controler.repetative();
		 }
	 public static void searchBasedOnType()
	 {
								 Scanner scanner=new Scanner(System.in);
								 System.out.print("Enter Type of book :");
								 String SearchType=scanner.nextLine();
								 BookDao bookDao=new BookDaoimp();
								 BookSystem result=bookDao.searchBasedOnBookType(SearchType);
								 System.out.println(result);
								 Controler.repetative();
	 }
	}
