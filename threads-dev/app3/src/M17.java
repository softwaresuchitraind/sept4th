interface A
{
	int test(int i,int j);
}

class M17
{
	public static void main(String[] args) 
	{
		A a1=( x, y)->
		{	
			System.out.println("from test");
			 return x+y;
		};//end with semicolon
		System.out.println(a1.test(10,20));
		System.out.println("done");
	}
}
/*
if there are multiple statements then return statement required.
it is applicable for only one method interface.
*/