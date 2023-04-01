package pack2;
import static java.lang.System.out;
import static java.lang.System.exit;
import static java.lang.Integer.*;
import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;
class M11
{
	public static void main(String[] args) 
	{
		out.println("main begin");
		out.println(MAX_VALUE);
		
		out.println(MIN_VALUE);
		out.println(MAX_VALUE);
		out.println(MIN_VALUE);
		out.println("main end");
	}
}

/*
main begin
127
-128
127
-128
main end

-every static member from interger but u specify in the byte
so preference go to byte.

*/