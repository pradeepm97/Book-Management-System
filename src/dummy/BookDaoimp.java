package dummy;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;

public class BookDaoimp extends ObjectClass implements BookDao{
	public BookSystem addBook(BookSystem rv) {
		arrayList.add(rv);
		return rv;
	}
	public BookSystem searchBasedOnBookTitle(String bookTitle) {
		checking();
		boolean sts=false;
		BookSystem b2=null;
     for(int i=0;i<=arrayList.size()-1;i++){
     b2=arrayList.get(i);
     String st=b2.getBookTitle();
     if(st.equals(bookTitle)){
    sts=true;
    break;
     }
	}
     if(sts){
    	 System.out.println(")>Book Found for the respective Title...");
    	 return b2;
     }else{
    	 System.out.println(")>Sorry No Match Found for that Title.");
    	 return null;
     }
     }
	public BookSystem searchBasedOnBookAuthor(String bookAuthor) {
		checking();
		boolean sts=false;
		BookSystem b2=null;
     for(int i=0;i<=arrayList.size()-1;i++){
     b2=arrayList.get(i);
     String st=b2.getBookAuthor();
     if(st.equals(bookAuthor)){
    sts=true;
    break;
     }
	}
     if(sts){
    	 System.out.println(")>Book Found for the respective Author...");
    	 return b2;
     }else{
    	 System.out.print(")>Sorry No Match Found for that Author.");
    	 return null;
     }
	}
	public BookSystem searchBasedOnBookType(String bookType) {
		checking();
		boolean sts=false;
		BookSystem b2=null;
     for(int i=0;i<=arrayList.size()-1;i++){
     b2=arrayList.get(i);
     String st=b2.getBookType();
     if(st.equals(bookType)){
    sts=true;
    break;
     }
	}
     if(sts){
    	 System.out.println(")>Book Found for the respective Type");
    	 return b2;
     }else{
    	 System.out.print(")>Sorry No Book Match Found for the Type Name.");
    	 return null;
     }
	}
	 public  void checking(){
		if(arrayList.size()==0){
			System.out.println("There is no books in library.");
			System.out.println(")>First add the book.");
			Controler.repetative();
			System.exit(0);
		}
	 }
}
