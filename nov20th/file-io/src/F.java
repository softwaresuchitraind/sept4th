import java.io.*;
class F
{
	public static void main(String[] args) 
	{
		File f1 = new File("Z:/xyz/manager.html");
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
IOException--path is not vailable
-If it is / donot require escaping,if it is \ require escaping
*/