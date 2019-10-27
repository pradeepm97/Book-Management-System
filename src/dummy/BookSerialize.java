package dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class BookSerialize {
	private static final String Finally = null;
	private static File f1=new File("./FileList/book.ser");
					public static void serializeBook()
					{
						FileOutputStream fos=null;
						ObjectOutputStream oos=null;
						try {
							f1.createNewFile();
							fos=new FileOutputStream(f1);
							oos=new ObjectOutputStream(fos);
							oos.writeObject(ObjectClass.arrayList);
							oos.flush();
						     }
						catch(Exception rv)
                        {
							System.out.println("somwthing went wrong...");
						}
						finally {
							
							try {
								fos.close();
								oos.close();
							} catch (IOException e) {
								System.out.println("something went wrong");
							}
						}
					}
public static void deSerializeBook() {
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	try {
		fis=new FileInputStream(f1);
		ois=new ObjectInputStream(fis);
		ObjectClass.arrayList=(ArrayList<BookSystem>)ois.readObject();
		
	}catch(Exception rv1) {
		System.out.println("something wrong");
	}
    finally {
    	try {
    		fis.close();
    		ois.close();
    	}catch(IOException rv2){
    		System.out.println("something wrong...");
    	}
    }
	}

}
