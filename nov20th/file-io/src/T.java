import java.io.*;
class T
{
	public static void main(String[] args)
		
	{
		
		
		try(FileWriter out = new FileWriter("data3.txt",true))
		{
			
			out.write("Hello to all\n");
			out.write("Hello \n to all");
			out.write("Hello to all");
				
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("done");
	}
}

/*
if any closable resource is opened in the try parenthesis
we do not require any finally block

-As we are using auto resource closing so finally block is not require.

-In jdk 1.7 closable resource can be opened in the try parathensic ,we do not require close.


*/