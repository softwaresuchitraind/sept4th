interface A
{
	int test(int i,int j);
}

class M16
{
	public static void main(String[] args) 
	{
		A a1=( x, y)-> x+y;
		System.out.println(a1.test(10,20));
		System.out.println("done");
	}
}
/*

if only one statement no return
*/