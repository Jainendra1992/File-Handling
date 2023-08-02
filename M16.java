package pack2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M16 {
public static void main(String[] args)
  throws Exception
{
	File f1 = new File("test3.ser");
	FileInputStream fin = new FileInputStream(f1);
	ObjectInputStream in = new ObjectInputStream(fin);
	
	V v1 = new V();
	 v1.readExternal(in);
	 
	 System.out.println(v1.i);
	 System.out.println(v1.j);
	 System.out.println(v1.k);
}
}
