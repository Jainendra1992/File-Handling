package pack2;

import java.io.IOException;
import java.io.PrintStream;

public class M19 {
public static void main(String[] args) throws IOException{
	PrintStream p1 = new PrintStream("test.log");
	p1.println(10);
	p1.println(10);
	p1.println(10);
	System.out.println(20);
	System.out.println(20);
	System.out.println(20);
}
}
