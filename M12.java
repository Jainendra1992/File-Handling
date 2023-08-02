package pack2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M12 {
public static void main(String[] args) throws Exception {
	
	File f1 = new File("test.ser");
	FileInputStream fin = new FileInputStream(f1);
	ObjectInputStream in = new ObjectInputStream(fin);
	T t1 = (T) in.readObject();
	System.out.println(t1.i);
	
}
}
//while serializing even version storing in file system 
//serialversion UID 