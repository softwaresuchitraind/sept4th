import java.io.*;
class E
{
	public static void main(String[] args) 
	{
		File f1 = new File("G:/abc/manager.html");
		System.out.println(f1.exists());
		try
		{
			System.out.println(f1.createNewFile());	
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(f1.exists());
	}
}

/*
-If it is / donot require escaping,if it is \ require escaping
*/