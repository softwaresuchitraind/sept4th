class A
{
	int i;
	int j;
	int k;
	A(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A(90,80,70);
		A a2 = new A(90,80,70);
		A a3 = a1;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
	}
}

/*
366712642
1829164700
366712642

-Hashcode() method not bothring about content.
-providing memory information rather than state of the Object.

*/