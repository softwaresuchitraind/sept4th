import java.util.regex.Pattern;// jdk 1.4
import java.util.regex.Matcher;
class M66
{
	public static void main(String[] args) 
	{
		String src = "abc xyz hello";
		String exp = "\\s";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() +" : " +m1.group());
		}
	}
}


// \s represents one space