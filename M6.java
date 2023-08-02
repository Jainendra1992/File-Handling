package pack2;

import java.io.FileWriter;
import java.io.IOException;

public class M6 {
	public static void main(String[] args) {
		
		try(FileWriter out =  new FileWriter("hello15.txt", true))
		{
		
		out.write("abc xyz test");
		out.write("abc xyz test");
		out.write("abc xyz test");
		out.write("\n abc xyz test");
		out.write("abc xyz test");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	  System.out.println("done");
	}
}
// file writer  implementing closable
// if any closable opening this is auto resource opening in the try
// this all about file writer 