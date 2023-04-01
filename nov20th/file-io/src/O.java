import java.io.*;
class O 
{
	public static void main(String[] args)
		throws IOException
	{
		File f1 = new File("data.txt");
		FileWriter out = new FileWriter(f1);
		out.write("Hello to all");
		out.write("Hello to all");
		out.write("Hello to all");
		out.flush();
		out.close();

		System.out.println("done");
	}
}

/*
-flush operation require only in writing not reading
*/
