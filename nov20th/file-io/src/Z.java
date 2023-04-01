import java.io.*;
class Z 
{
	public static void main(String[] args) 
		throws IOException
	{
		FileWriter out = null;
		BufferedWriter bout = null;
		try
		{
			out = new FileWriter("data4.txt");
			bout = new BufferedWriter(out);
			
			bout.write("hello to all");
			bout.newLine();
			bout.write("hello to all");
			bout.write("hello to all");
			bout.newLine();
			bout.write("hello to all");
		}
		catch (IOException ex)
		{
		}
		finally
		{
			try
			{
				if(bout != null)
				{
					bout.flush();
					bout.close();
					bout= null;
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
				try
				{
					if(out !=null)
					{
						out.close();
						out=null;
					}
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
			}
		}
		
		System.out.println("done");
	}
}

/*
BufferedWriter internally uses buffer.
*/
