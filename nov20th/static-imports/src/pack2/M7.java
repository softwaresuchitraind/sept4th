package pack2;
import static pack1.A.i;
import static pack1.A.test1;
import static pack1.B.j;
import static pack1.B.k;
import static pack1.C.CON1;
import static pack1.C.CON2;
import static pack1.C.CON3;
import static java.lang.System.out;
import pack1.A;
class M7
{
	public static void main(String[] args) 
	{
		out.println(i);
		out.println(j);
		out.println(k);
		out.println(CON1);
		out.println(CON2);
		out.println(CON3);
		test1();
		A a1 = new A();
	}
}

/*

100
200
300
CON1
CON2
CON3
from pack1.A.test1

 -inside a System class out is a static member we are importing out

*/