package pack2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class U  implements Serializable{
	int i;
	int j;
	int k;
	private void WriteObject(ObjectOutputStream out)
	throws IOException{
		System.out.println("i am from defaultWrite");
		out.defaultWriteObject();
		out.writeInt(3000);
		out.writeUTF("xyz");
		
	}
	private void readObject(ObjectInputStream in)
			throws IOException,ClassNotFoundException
	{
		System.out.println("i am from defaultRead");
		in.defaultReadObject();
		System.out.println(in.readInt());
		System.out.println(in.readUTF());
		
	}

}
// UTF universal text format
// readObject and writeObject private  we never called these method these method is framework
// 