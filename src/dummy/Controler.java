package dummy;

import java.util.Scanner;

public class Controler  extends Thread{
public  void run() {
	System.out.println("************************************");
	System.out.println("*    Library-Management System     *");
	System.out.println("************************************");
	 bookservices();
}
public static void repetative(){
	Scanner scanner=new Scanner(System.in);
	System.out.println("******************************************************!");
	System.out.print(">>Press 1  for Options  or Press Any Key to Exit :");
		String ref=scanner.nextLine();
	System.out.println("**********************************");
	if(ref.equals("1")){
		UserInterface.inputValidation();
	}
	else{
	System.out.println("   <:)  Thankyou  have a nice day.");
	BookSerialize.serializeBook();
	}
}
public static void bookservices() {
	System.out.println("1:start the services with new bookServices");
	System.out.println("2:start the service with exising bookservices");
	System.out.println("enter your choice:");
	Scanner scanner=new Scanner(System.in);
	int i=scanner.nextInt();
	switch(i) {
	case 1:BookSerialize.serializeBook();
	UserInterface.inputValidation();   
	           break;
	case 2:BookSerialize.deSerializeBook();
	UserInterface.inputValidation();   
               break;
	default: System.out.println("you enterd wrong option:");
	            bookservices();
	}
}
}
