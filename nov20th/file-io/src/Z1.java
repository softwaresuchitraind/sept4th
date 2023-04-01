import java.io.*;
class Z1 
{
	public static void main(String[] args) 
		
	{
		
		try(FileWriter out= new FileWriter("data4.txt",true);
			BufferedWriter bout = new BufferedWriter(out))
		{
			bout.write("hello to all");
			bout.newLine();
			bout.write("hello to all");
			bout.write("hello to all");
			bout.newLine();
			bout.write("hello to all");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("done");
	}
}

/*
BufferedWriter internally uses buffer.
*/
