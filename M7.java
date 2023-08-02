package pack2;

import java.io.FileReader;
import java.io.IOException;

public class M7 {
public static void main(String[] args) throws IOException{
	FileReader in  = new FileReader("hello12.txt");
	char[] chars = new char[10000];
	in.read(chars);
	String s1 = new String(chars);
	System.out.println(s1);
}
}
// every 
// in the string class several constructor 
// define charter array 