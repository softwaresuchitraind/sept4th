import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
class T7A 
{
	public static void main(String[] args) 
	{
		double num = 2345463.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
		String s1 = nf.format(num);
		try
		{
			double num1 = (Double) nf .parse(s1);
			System.out.println(num1);
		}
		catch (ParseException ex)
		{
		}
	}
}

/*
2345463.56786
2345463.57
*/