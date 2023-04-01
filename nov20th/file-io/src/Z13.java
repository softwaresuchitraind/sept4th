import java.io.*;
class Z13 
{
	public static void main(String[] args) throws IOException
	{
		PrintStream pout = new PrintStream("test2.log");
		PrintStream sout = System.out;
		System.out.println(1);//c
		pout.println(2);//f
		sout.println(3);//c
		System.setOut(pout);
		System.out.println(4);//f
		pout.println(5);//f
		sout.println(6);//c
		System.setOut(sout);
		System.out.println(7);//c
		pout.println(8);//f
		sout.println(9);//c
	}
}
/*
1
3
6
7
9
*/