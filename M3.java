package pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("hello12.txt");
		FileWriter out = new FileWriter(f1, true);
		out.write("abc xyz test");
		out.write("abc xyz test");
		out.write("abc xyz test");
		out.write("\n abc xyz test");
		out.write("abc xyz test");
	  out.flush();
	  out.close();
	  System.out.println("done");
	}
}
// run and referece file and got to hello12 
// output 
//abc xyz testabc xyz testabc xyz test
//abc xyz testabc xyz testabc xyz testabc xyz testabc xyz test
//abc xyz testabc xyz testabc xyz testabc xyz testabc xyz test
//abc xyz testabc xyz testabc xyz testabc xyz testabc xyz test
//abc xyz testabc xyz testabc xyz testabc xyz testabc xyz test
//abc xyz testabc xyz test