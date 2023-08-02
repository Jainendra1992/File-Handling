package pack2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M9 {
	public static void main(String[] args) throws IOException{
		File f1  = new File("hello20.txt");
		FileReader in  = new FileReader(f1);
		char[] chars = new char[(int) f1.length()];
		in.read(chars);
		String s1 = new String(chars);
		System.out.println(s1);
		in.close();
	}

}
// file reader operation we can not supply file which is not available 
// read operation allays required available file 