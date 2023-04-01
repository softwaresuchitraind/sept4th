import java.util.regex.Pattern;// jdk 1.4
import java.util.regex.Matcher;
class M70
{
	public static void main(String[] args) 
	{
		String src = "abc xyz hello";
		String exp = "o$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}


// o$--- $ reprents ending , String ending with o or not