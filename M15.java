package pack2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class M15 {
public static void main(String[] args)throws Exception {
	 File f1 = new File("test3.ser");
	 FileOutputStream fout = new FileOutputStream(f1);
	 ObjectOutputStream out = new ObjectOutputStream(fout);
	 
	  V obj = new V();
	  obj.i = 100;
	  obj.j = 3.4;
	  obj.k = "hello";
	  obj.writeExternal(out);
	  
	  out.flush();
	  out.close();
	  fout.close();
	  System.out.println("done");
}
}
