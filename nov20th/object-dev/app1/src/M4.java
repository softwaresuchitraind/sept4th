class A
{
	int i;
	public String toString()
	{
		return "i = " + i;
	}
}
class M4 
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		a1.i =10;
		System.out.println(a1);
		// calling toSting() method of overided A
	}
}
/*

i = 10
-we are least bothing about memory address. 
we are bothing about state of the object
-content of the object
-memory of the object is not printing state of the object 
is printing


*/
