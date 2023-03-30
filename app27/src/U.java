//overide same signature
 class A
{
	 void test()
	{
		System.out.println("A.test()");
	}
}
class U extends A
{
	public void test()
	{
		System.out.println("from subclass.test()");
		
	}
	public static void main(String[] args) 
	{
		
		System.out.println("done");
	}
}
/*
done
while overloading a method accless level may be wider
private
default
protected
public
every interface method should be implemented public. 
*/