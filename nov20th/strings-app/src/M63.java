import java.util.regex.Pattern;// jdk 1.4
import java.util.regex.Matcher;
class M63
{
	public static void main(String[] args) 
	{
		String src = "a1b2c3%4_5R*Y0$";
		String exp = "\\D";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() +" : " +m1.group());
		}
	}
}


// \D  -- other than digits 