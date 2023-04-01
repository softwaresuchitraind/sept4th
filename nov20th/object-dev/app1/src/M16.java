class A
{
	int i;
	A(int i)
	{
		this.i =i;
	}
}
class M16
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		A a3 = a1;
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		System.out.println(a1.i == a2.i);
	}
}

/*
false
true
true

a1.i is checking the content not memory locations
== operator checking the both the objects refering to same object or not.

*/