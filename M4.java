package pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M4 {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("hello13.txt", true);
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
// writing file constant this way of writing very simple 