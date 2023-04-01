import java.io.*;
class M
{
	public static void main(String[] args) 
	{
		File f1 = new File("G:/abc");
		File f2 = new File(f1,"dir3");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
