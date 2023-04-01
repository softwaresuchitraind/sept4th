import java.io.*;
class G
{
	public static void main(String[] args) 
	{
		File f1 = new File("G:/abc", "Test.java");
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

//two agrgument--path,file name