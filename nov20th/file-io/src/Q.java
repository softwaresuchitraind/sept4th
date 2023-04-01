import java.io.*;
class Q
{
	public static void main(String[] args)
		throws IOException
	{
		
		FileWriter out = new FileWriter("date2.txt");
		out.write("Hello to all\n");
		out.write("Hello \n to all");
		out.write("Hello to all");
		out.flush();
		out.close();

		System.out.println("done");
	}
}

/*
FileWriter is not checking for existing file,if not available it creates a new file.
if file is available it uses same file.
u can  supply string itself rather than flie object.
there is no bulid in method to go to next line we have to use \n explicitely to go
to the next line

*/