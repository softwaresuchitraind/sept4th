import java.text.NumberFormat;
class T4 
{
	public static void main(String[] args) 
	{
		double num = 234546.56786;
		System.out.println(num);
		NumberFormat nf= NumberFormat.getInstace(Locale.ITALY);
		String s1= nf.format(num);
		System.out.println(s1);
	}
}
