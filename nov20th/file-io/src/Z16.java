import java.io.*;
class A implements Serializable 
{
	int i;
	int j;
	int k;
	A(int i,int j, int k)
	{
		this.i =i;
		this.j =j;
		this.k =k;
	}
	//customization
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		k = 0;
		out.defaultWriteObject();
	}
}
class  Z16
{
	public static void main(String[] args) 
	{
		A a1 = new A(10, 20,30);
		try(FileOutputStream fout= new FileOutputStream("test4.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		FileInputStream fin = new FileInputStream("test4.ser");
		ObjectInputStream in = new ObjectInputStream(fin))
		{
			out.writeObject(a1);
			A a2 = (A)in.readObject();
			System.out.println(a2.i);
			System.out.println(a2.j);
			System.out.println(a2.k);
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
10
20
0
done

Serialization is a Objectwise operation.
*/