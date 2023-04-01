import java.io.*;
class  X
{
	public static void main(String[] args) 
	{
		File f1 = new File("data3.txt");
		char[] chars = new char[(int)f1.length()];
		
		try(FileReader fin = new FileReader(f1))
		{
			
			fin.read(chars);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
