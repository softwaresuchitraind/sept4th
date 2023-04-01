import java.io.*;
class L
{
	public static void main(String[] args) 
	{
		File f1 = new File("G:/abc", "dir2");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
