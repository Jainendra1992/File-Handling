package pack2;

import java.io.File;
import java.io.IOException;

import java.io.FileWriter;

public class M1 {
public static void main(String[] args) throws IOException {
	File f1 = new File("hello10.txt");
	FileWriter out = new FileWriter(f1);
	out.write("abc xyz test");
	out.write("abc xyz test");
	out.write("abc xyz test");
	out.write("abc xyz test");
	out.write("abc xyz test");
	out.write("abc xyz test");
	out.write("abc xyz test");
  out.flush();
  out.close();
  System.out.println("done");
}
}
// file writer is a class several method in the there best flush(), closed() where your java program is running from that location 
// Connecting to the file not available to create file and if file available to used 
// \n 