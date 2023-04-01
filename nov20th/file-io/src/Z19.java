import java.io.*;
class A implements Serializable
{
	int k;
	A()
	{
		k =20;
		System.out.println("A()");
	}
}
class B extends A 
{
	int i;
	B()
	{
		i =10;
		System.out.println("B()");
	}
}
class Z19
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.i =90;
		b1.k =190;
		try(FileOutputStream fout = new FileOutputStream("test4.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			FileInputStream fin = new FileInputStream("test4.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
			{
				out.writeObject(b1);
				System.out.println(".........");
				B b2 = (B)in.readObject();
				System.out.println(b2.i+ " " +b2.k);
			
			}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}

/*
A()
B()
.........
90 190
done

-while deserializing Class A constructore is executing.
-While deserializating super class constructor is executing.

*/
