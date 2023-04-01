import java.io.*;
class P
{
	public static void main(String[] args)
		throws IOException
	{
		File f1 = new File("data1.txt");
		FileWriter out = new FileWriter(f1);
		out.write("Hello to all\n");
		out.write("Hello \n to all");
		out.write("Hello to all");
		out.flush();
		out.close();

		System.out.println("done");
	}
}

/*

there is no bulid in method to go to next line we have to use \n explicitely to go
to the next line

*/