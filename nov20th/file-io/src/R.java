import java.io.*;
class R
{
	public static void main(String[] args)
		throws IOException
	{
		
		FileWriter out = new FileWriter("date3.txt",true);
		out.write("Hello to all\n");
		out.write("Hello \n to all");
		out.write("Hello to all");
		out.flush();
		out.close();

		System.out.println("done");
	}
}

/*
2nd argument is append type.

false--means it is not adding to the end it is overwriting
true--add at the end.

if u do not want previous content then go for false. It will keep updating new data with existng data

Default append is false.

*/