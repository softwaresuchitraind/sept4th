enum G
{
	CON1, CON2, CON3, CON4	
}
class H
{
	public static void main(String[] args) 
	{
		G g1 = G.CON1;
		G g2 = G.CON4;
		System.out.println(g1);
		System.out.println(g2);
	}
}

/*
CON1
CON4

-We can assign one constant to reference variable.
-Enums can be used as a derived datatype purpose.

*/