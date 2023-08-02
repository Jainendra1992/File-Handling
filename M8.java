package pack2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M8 {
	public static void main(String[] args) throws IOException{
		File f1  = new File("hello12.txt");
		FileReader in  = new FileReader(f1);
		char[] chars = new char[(int) f1.length()];
		in.read(chars);
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
// f1.length method returning total number of character form of a  long 
// array should be specified  