class A
{
	int i;
	A(int i)
	{
		this.i =i;
	}
}
class M15
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		A a3 = a1;
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
	}
}

/*

false
true

a1 and a3 both are refering to the same object

*/