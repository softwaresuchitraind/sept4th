import java.io.*;
class H
{
	public static void main(String[] args) 
	{
		File f1 = new File("G:/abc");
		File f2 = new File(f1,"Test.java");
			
		System.out.println(f2.exists());
		try
		{
			System.out.println(f2.createNewFile());	
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(f2.exists());
	}
}

//two agrgument--path,file name