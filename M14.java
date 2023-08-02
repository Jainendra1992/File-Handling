package pack2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M14 {
public static void main(String[] args) 
  throws Exception
 {
	File f1 = new File("test2.ser");
	FileInputStream fin = new FileInputStream(f1);
	ObjectInputStream in = new ObjectInputStream(fin);
 }
}
