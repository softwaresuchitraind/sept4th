import java.io.*;
class V  
{
	public static void main(String[] args)
		throws IOException
	{
		File f1 = new File("data3.txt");
		FileReader fin = new FileReader(f1);
		char[] chars = new char[(int)f1.length()];
		fin.read(chars);
		String s1 = new String(chars);
		System.out.println(s1);
		fin.close();
	}
}