import java.text.NumberFormat;
import java.util.Locale;
class T6 
{
	public static void main(String[] args) 
	{
		double num = 2345463.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}

/*
country to country representation is different
comma in place of . and . in place of comma, they are using


2345463.56786
2.345.463,568
*/