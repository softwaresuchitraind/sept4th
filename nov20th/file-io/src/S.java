import java.io.*;
class S
{
	public static void main(String[] args)
		throws IOException
	{
		
		FileWriter out = null;
		try
		{
			out = new FileWriter("data3.txt",true);
			out.write("Hello to all\n");
			out.write("Hello \n to all");
			out.write("Hello to all");
				
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(out != null)
				{
					out.flush();
					out.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		
		}

		System.out.println("done");
	}
}