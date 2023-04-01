import java.text.NumberFormat;
import java.util.Locale;
class T7 
{
	public static void main(String[] args) 
	{
		double num = 2345463.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}

//not only formating a number but also currency symbol

/*
G:\nov20th\strings-app\src>java -cp ../classes T7
2345463.56786
£2,345,463.57

getting currency symbol also
*/