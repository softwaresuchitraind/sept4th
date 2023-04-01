class A
{
	int i;
	int j;
	int k;
	double m;
	A(int i, int j, int k, double m)
	{
		this.i = i;
		this.j = j;
		this.k = k;
		this.m = m;
	}
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		String s3 = Integer.toString(k);
		String s4 = Double.toString(m);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		hash += s3.hashCode();
		hash += s4.hashCode();
		return hash;
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(90,80,70,100.8);
		A a2 = new A(90,80,70,100.8);
		A a3 = new A(90,80,170,100.8);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
	}
}

/*

46735459
46735459
46782548


-String class hashcode() method generating a number based on content.
*/