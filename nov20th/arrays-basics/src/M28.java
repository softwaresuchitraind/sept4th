import java.util.Arrays;
class M28
{
	public static void main(String[] args) 
	{
		int[] x = new int[10];
		int[] y = new int[20];
		x = y; //stmt1
		y = x; //stmt2
		System.out.println("done");
	}
}

/*
compiler bothering about datatype not size
*/