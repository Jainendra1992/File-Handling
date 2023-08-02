package pack2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M10 {
	public static void main(String[] args) throws IOException{
		File f1  = new File("hello12.txt");
		try(FileReader in  = new FileReader(f1))
      {
		char[] chars = new char[(int) f1.length()];
		in.read(chars);
		String s1 = new String(chars);
		System.out.println(s1);
      }
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
// this use of new approach 
//Buffer => small memory 
//low level api possibility is there not effective mainly operational type 
// line by line read and writing not possible 
// \n there is method .Buffer reader which is built on top reader and on top of buffer writer  