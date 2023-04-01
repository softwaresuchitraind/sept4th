import java.io.*;
class A implements Serializable 
{
	int i;
	static int j;
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
		out.writeInt(j);
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		in.defaultReadObject();
		//only i and k reading ,separately we read j
		j = in.readInt();
		k = 50;
	}
}
class  Z17
{
	public static void main(String[] args) 
	{
		A a1 = new A(10, 20,30);
		try(FileOutputStream fout=
			new FileOutputStream("test4.ser");
		ObjectOutputStream out =
			new ObjectOutputStream(fout);
		FileInputStream fin =
			new FileInputStream("test4.ser");
		ObjectInputStream in =
			new ObjectInputStream(fin))
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
static members are not object members .
while Serializing static members are not serializing.
static members are not writing into the Filesystem.
static members are not serializing.
Only non static members wrote into the file.


-writeObject() and readObject() both should be in the Serializable class.
-both should be private

10
20
0
done

*/