import java.io.*;
class A implements Serializable
{
}
class B extends A
{
	int i;
}
class  Z6
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.i = 10;
		try(FileOutputStream fout = new FileOutputStream("test2.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			FileInputStream fin = new FileInputStream("test2.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
		{
			out.writeObject(b1);
			B b2 = (B)in.readObject();
			System.out.println(b2.i);
			System.out.println(b1.i);
			b1.i = 30;
			b2.i = 60;
			System.out.println(b1.i);
			System.out.println(b2.i);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("Hello World!");
	}
}
/*

10
10
30
60
Hello World!
-readObject()- deserialization method requires ClassNotFoundException


b1 poninting to origional object --b2 pointing to deserialised object.
changes in b1 and b2 is not affecting.

Serialization process is called deep copy operation.
changes in origional not reflecting to duplicate and changes in duplicate not reflecting origional.
*/
