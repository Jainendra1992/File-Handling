package pack2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class M13 {
public static void main(String[] args) throws Exception{
	
	{
		File f1 = new File ("test2.ser");
		FileOutputStream fout = new FileOutputStream(f1);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		U obj = new U();
		obj.i =100;
		obj.j =200;
		obj.k =300;
		 out.writeObject(obj);
		 out.flush();
		 out.close();
		 fout.close();
		 System.out.println("done");
	}
}
}
