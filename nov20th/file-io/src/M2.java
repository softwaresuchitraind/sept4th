import java.io.*;
class A implements Serializable
{
	int i;
}
class M2 
{
	public static void main(String[] args) throws IOException
	{
		A a1 = new A();
		a1.i = 20;
		FileOutputStream fout = new FileOutputStream("test1.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		fout.close();
		System.out.println("done");
	}
}

/*
done

-in order to serialize any object that object should be Serializable type.
Serilizable is a marker interface.--any interface having no memebers

*/