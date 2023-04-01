import java.io.*;
class M5 
{
	public static void main(String[] args) 
		throws IOException, ClassNotFoundException
	{
		FileInputStream fin = new FileInputStream("test2.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		Person p1 = (Person) in.readObject();
		in.close();
		fin.close();
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.weight);
	}
}

/*

null
22
4.5

creating an object to Person class name is not a member of object
-static members are not serving in the Serialization as static members are not a part of object.

*/