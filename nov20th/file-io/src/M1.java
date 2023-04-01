import java.io.*;
class A
{
	int i;
}
class M1 
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
Exception


Exception in thread "main" java.io.NotSerializableException: A
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
        at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
        at M1.main(M1.java:14)


What is Serialization ?
-writing object state in file system is more unsecured Object creation.
-If object is a type of serializable  then serialization is success.

*/
