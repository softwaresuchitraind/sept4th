import java.io.*;
class Z3 
{
	public static void main(String[] args) throws IOException
	{
		File f1 = 
		new File("C:\\Users\\SUCHITRA\\Pictures\\Saved Pictures\\mymail.jpg");
		FileInputStream fin = new FileInputStream(f1);
		BufferedInputStream bin = new BufferedInputStream(fin);
		byte[] bytes = new byte[(int)f1.length()];
		bin.read(bytes);
		bin.close();
		fin.close();

		File f2 = new File("test.jpg");
		FileOutputStream fout = new FileOutputStream(f2);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(bytes);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("done");
	}
}
