import java.io.Console;
class Z15 
{
	public static void main(String[] args) 
	{
		Console c1 = System.console();
		System.out.println("enter some thing");
		char[] data = c1.readPassword();
		String s1 = new String(data);
		System.out.println(s1);
	}
}

/*
it is used for reading any confidential data/secreate data
*/
