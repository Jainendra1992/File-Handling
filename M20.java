package pack2;

import java.io.IOException;
import java.io.PrintStream;

public class M20 {
	
public static void main(String[] args)throws IOException {
	PrintStream p1 = new PrintStream("test1.log");
	PrintStream p2 =  System.out;
	
	p1.println(1);
	p2.println(2);
	System.out.println(3);
	
	System.setOut(p1);
	p1.println(4);
	p1.println(5);
	System.out.println(6);
	
	System.setOut(p2);
	p1.println(7);
	p1.println(8);
	System.out.println(9);
	
}
}
