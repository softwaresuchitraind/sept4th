import java.io.*;
class A implements Serializable
{
	int i;
	transient int j;
}
class Z151 
{
	public static void main(String[] args) throws Exception
	{
		A a1 = new A();
		a1.i = 10;
		a1.j = 20;
		FileOutputStream fout = new FileOutputStream("test3.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		FileInputStream fin = new FileInputStream("test3.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		A a2 = (A)in.readObject();
		System.out.println(a2.i);
		System.out.println(a2.j);
	}
}

/*

10
0

-tranient variables are not surviving for Serialization.
-transient variables are not writing into the file System in Serialization.

if u want any non static variable to not part of Serialization declare it as transient.
*/