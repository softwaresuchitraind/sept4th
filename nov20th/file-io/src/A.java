import java.io.*;
class A 
{
	public static void main(String[] args) 
		throws IOException
	{
		File f1 = new File("abc.txt");
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println(f1.exists());
	}
}
