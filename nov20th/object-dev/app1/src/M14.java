class A
{
	int i;
	A(int i)
	{
		this.i =i;
	}
}
class M14 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		System.out.println(a1 == a2);
	}
}

/*

false
== operator if it is receiving refernce it returns false even if content same.
it is checking memory locations--whether same object or differnet object
== operator checks refernce variable.

*/
