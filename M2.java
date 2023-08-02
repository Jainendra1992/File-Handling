package pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class M2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("hello11.txt");
		FileWriter out = new FileWriter(f1);
		out.write("abc xyz test");
		out.write("abc xyz test");
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
// flush and close 
// by default is false 
//\n is used for new line 