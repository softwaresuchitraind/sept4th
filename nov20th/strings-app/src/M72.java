import java.util.regex.Pattern;// jdk 1.4
import java.util.regex.Matcher;
class M72
{
	public static void main(String[] args) 
	{
		String src = "a123b456c789";
		String exp = "\\d";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() +" : " +m1.group());
		}
	}
}


// occurances of every group