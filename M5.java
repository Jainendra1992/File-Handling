package pack2;

import java.io.FileWriter;
import java.io.IOException;

public class M5 {
	public static void main(String[] args) throws IOException {
		FileWriter out = null; // insilizating statements also checked type of exception
		try
		{
		out = new FileWriter("hello14.txt", true);
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
		finally
		{
			if(out != null) //out declare try block before if block avoid null pointer exception
			{
				try
				{
					out.flush(); // checked exception type statements IOException 
					out.close(); // checked exception type statements IOException 
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
	  System.out.println("done");
	}
}
// flush close every time execute time 
//used of fisical connection  got 