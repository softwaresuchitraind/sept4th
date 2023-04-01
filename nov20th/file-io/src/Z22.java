import java.io.*;
class Person implements Externalizable
{
	String firstName;
	Integer age;
	Double weight;
	public void writeExternal(ObjectOutput out)throws IOException
	{
		//out.writeUTF(firstName);
		out.writeInt(age);
		out.writeDouble(weight);
	}
	public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException
	{
		//firstName = in.readUTF();
		age = in.readInt();
		weight = in.readDouble();
	}
}
class  Z22
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.firstName = "Ramu";
		p1.age = 33;
		p1.weight = 55.5;

		Person p2 = new Person();
		try(FileOutputStream fout = new FileOutputStream("test6.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout))
		{
				p1.writeExternal(out);
				
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		try(FileInputStream fin = new FileInputStream("test6.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
		{
				p2.readExternal(in);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}

		System.out.println(p2.firstName);
		System.out.println(p2.age);
		System.out.println(p2.weight);
	}
}
/*
in previous same try write and read so flush is required.
-here flush() is not required as immidiately after writing ,reading is not happening
-after writing if we not flush we get runtime exception.
*/
