import java.io.*;
class I 
{
	public static void main(String[] args) 
	{
		File f1 = new File("dir1");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
//by using mkdir() we can create a directory also.--doen not require try~catch