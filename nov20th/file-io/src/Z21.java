import java.io.*;
class Person implements Externalizable
{
	String firstName;
	Integer age;
	Double weight;
	public void writeExternal(ObjectOutput out)throws IOException
	{
		out.writeUTF(firstName);
		out.writeInt(age);
		out.writeDouble(weight);
	}
	public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException
	{
		firstName = in.readUTF();
		age = in.readInt();
		weight = in.readDouble();
	}
}
class  Z21
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.firstName = "Ramu";
		p1.age = 33;
		p1.weight = 55.5;

		Person p2 = new Person();
		try(FileOutputStream fout = new FileOutputStream("test6.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			FileInputStream fin = new FileInputStream("test6.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
		{
				p1.writeExternal(out);
				out.flush();
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
Externalization
..................
-Externalizable is an interface it is extending Serializable.
-Externalizable is not a marker interface it is containing two methods
-it is containing two abstract methods writeExternal and readExternal()
-in the body of the writeExternal() u can write the atttribute u wanted.
-in the same order u have to read in readExternal().

* writing attribute by attribute-----------------Externalization

Ramu
33
55.5

UTF --Universal Text Format

*/
