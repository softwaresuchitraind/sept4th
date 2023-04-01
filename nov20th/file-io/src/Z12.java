import java.io.*;
class Z12 
{
	public static void main(String[] args) throws IOException
	{
		PrintStream pout = new PrintStream("test1.log");
		System.setOut(pout);
		System.out.println("Hello to all");
		System.out.println("Hello to all");
		System.out.println("Hello to all");
		System.out.println("Hello to all");
		System.out.println("end");
	}
}

//printing in the log
