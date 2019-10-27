package dummy;

import java.util.regex.Pattern;

class Checking {
public static boolean validateTitle(String booktitle) {
	Pattern p1=Pattern.compile("[A-Za-z]+");
	boolean b1= p1.matcher(booktitle).matches();
	return b1;
}
public static boolean validateType(String booktype) {
	Pattern p1=Pattern.compile("[A-Za-z]+");
	boolean b1= p1.matcher(booktype).matches();
	return b1;
}
public static boolean validateauthor(String bookauthor) {
	Pattern p1=Pattern.compile("[A-Za-z]+");
	boolean b1= p1.matcher(bookauthor).matches();
	return b1;
}
public static boolean validateprice(String bookprice) {
	Pattern p1=Pattern.compile("[0-9]+");
	boolean b1= p1.matcher(bookprice).matches();
	return b1;
}
}