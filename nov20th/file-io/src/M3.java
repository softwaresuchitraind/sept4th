//deseriaization
import java.io.*;
class M3 
{
	public static void main(String[] args) 
		throws IOException,ClassNotFoundException
	{
		FileInputStream fin = new FileInputStream("test1.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		A a1 = (A)in.readObject();
		in.close();
		fin.close();
		System.out.println(a1.i);
	}
}
/*
G:\nov20th\file-io\src>javac -d ../classes M2.java M3.java

G:\nov20th\file-io\src>java -cp ../classes M3
20

// reading object data from the file system
*/
