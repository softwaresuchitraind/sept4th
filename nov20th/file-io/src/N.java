import java.io.*;
class N
{
	public static void main(String[] args) 
	{
		File f1 = new File("abc.txt");
		File f2 = new File("dir1");
		System.out.println(f1.isFile());
		System.out.println(f2.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f2.isDirectory());
	}
}
/*

whether file object is refering to file or directory that can be identified.
-writing some content to the file and reading from file
there are two types of file available what afre those

-text file/character file
-Binary file

What is text file ?
Ans :-Any file which we can understand the content of file.
-If human being understand the file

-If we are unable to understand the content of the file that is called binary file.


*/
