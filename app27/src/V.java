//overide same signature
 class A
{
	private void test()
	{
		System.out.println("A.test()");
	}
}
class V extends A
{
	private  void test()//access level should be same or wider
	{
		System.out.println("from subclass.test()");
		
	}
	public static void main(String[] args) 
	{
		
		System.out.println("done");
	}
}
/*
compile time error
while overloading a method accless level may be wider
private
default
protected
public
every interface method should be implemented public. 
*/