import java.util.regex.Pattern;// jdk 1.4
import java.util.regex.Matcher;
class M71
{
	public static void main(String[] args) 
	{
		String src = "abc xyz hello";
		String exp = "l$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}


// String is not ending with l, u will be getting false