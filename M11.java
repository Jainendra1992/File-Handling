package pack2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class M11 {
public static void main(String[] args) throws Exception{
	File f1 = new File ("test.ser");
	FileOutputStream fout = new FileOutputStream(f1);
	ObjectOutputStream out = new ObjectOutputStream(fout);
	T t1 = new T();
	t1.i =  200;
	out.writeObject(t1);
	out.flush();
	out.close();
	fout.close();
	System.out.println("done");
}
}
