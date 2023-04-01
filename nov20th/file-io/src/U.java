//Reading the content from the text file
import java.io.*;
class U  
{
	public static void main(String[] args)
		throws IOException
	{
		File f1 = new File("data3.txt");
		FileReader fin = new FileReader(f1);
		char[] chars = new char[10];
		String s1 = new String(chars);
		System.out.println(s1);
		fin.close();
	}
}
/*
-to read the content we have to supply only existing file.
no flush is required for reading
*/