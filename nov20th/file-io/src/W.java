import java.io.*;
class  W
{
	public static void main(String[] args) 
	{
		File f1 = new File("data3.txt");
		char[] chars = new char[(int)f1.length()];
		FileReader fin = null;
		try
		{
			fin = new FileReader(f1);
			fin.read(chars);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(fin != null)
				{
					fin.close();
					fin = null;//make object garbage
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
