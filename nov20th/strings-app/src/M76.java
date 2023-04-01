import java.util.regex.Pattern;// jdk 1.4
import java.util.regex.Matcher;
class M76
{
	public static void main(String[] args) 
	{
		String src = "abc4xyz6hello";
		String exp = "[a-z]";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() +" : " +m1.group());
		}
	}
}

//all lowercase alphabets whereeve available
