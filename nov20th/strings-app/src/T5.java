import java.text.NumberFormat;
class T5 
{
	public static void main(String[] args) 
	{
		double num = 2345463.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getInstance();
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}

/*
formating a number into a String
number can also be formatted.


2345463.56786
2,345,463.568

*/
