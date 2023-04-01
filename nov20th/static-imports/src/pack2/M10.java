package pack2;
import static java.lang.System.out;
import static java.lang.System.exit;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;
class M10
{
	public static void main(String[] args) 
	{
		out.println("main begin");
		out.println(MAX_VALUE);
		exit(0);
		out.println(MIN_VALUE);
		out.println(MAX_VALUE);
		out.println(MIN_VALUE);
		out.println("main end");
	}
}


/*

cte--ambigous
-if at all two static members of same name importing from two different classes
u have to use along with the class name.--this is one small point to remember

*/