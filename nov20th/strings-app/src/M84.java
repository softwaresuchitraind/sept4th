import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M84
{
	public static void main(String[] args) 
	{
		String src = "a1.B.C1.d5@hello";
		String exp = "^[a-zA-Z]([a-zA-Z0-9_]+\\.)*[a-zA-Z0-9_]+@[a-z]+$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}

/*

true

after@ minimum one character before end.

[a-zA-Z] ---lowercase range immediately upperc case range

([a-zA-Z0-9_]+\\.)* ---multiple characters--+ represents minimum one
minimum one character with a .




*/
