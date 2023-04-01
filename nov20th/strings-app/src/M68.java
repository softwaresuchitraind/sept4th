import java.util.regex.Pattern;// jdk 1.4
import java.util.regex.Matcher;
class M68
{
	public static void main(String[] args) 
	{
		String src = "abc xyz hello";
		String exp = "^a";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}


// ^ represents starting of a string , if string is starting with a then find method returns true