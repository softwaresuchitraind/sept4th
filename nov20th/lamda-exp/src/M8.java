interface A
{
	void test(int i);
}
class M8
{
	public static void main(String[] args) 
	{
		A a1 = (x) ->System.out.println("from test:" +x);
		a1.test(10);
		System.out.println("done");
	}
}
/*
if only one method is there no need to specify datatype of the argument.

from test:10
done

*/