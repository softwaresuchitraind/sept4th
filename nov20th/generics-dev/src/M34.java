class A < X >
{
	X obj;
}
class M34
{
	
	public static void main(String[] args) 
	{
		A < ? > a1 = null;
		a1 = new A<Integer>();
		//a1 = new A<String>();
		a1.obj = 30;
		System.out.println("done");
	}
}


/*

cte

compiler checks what is a1 not where a1 is pointing.

a1 datatype is not fixed. so we can not assign any value

*/