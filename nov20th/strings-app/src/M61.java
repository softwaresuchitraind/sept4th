import java.util.regex.Pattern;// jdk 1.4
import java.util.regex.Matcher;
class M61
{
	public static void main(String[] args) 
	{
		String src = "abc1hello2chech3test4";
		String exp = "[1-4]";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() +" : " +m1.group());
		}
	}
}


// - means range