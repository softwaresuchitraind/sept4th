import java.io.*;
class Y 
{
	public static void main(String[] args) 
		throws IOException
	{
		FileWriter out = new FileWriter("data4.txt");
		BufferedWriter bout = new BufferedWriter(out);
		bout.write("hello to all");
		bout.newLine();
		bout.write("hello to all");
		bout.write("hello to all");
		bout.newLine();
		bout.write("hello to all");
		bout.flush();
		bout.close();
		out.close();
		System.out.println("done");
	}
}

/*
BufferedWriter internally uses buffer.
*/
