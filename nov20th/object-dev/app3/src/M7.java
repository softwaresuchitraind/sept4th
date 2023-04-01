import java.util.HashSet;
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
	public String toString()
	{
		return "(" + i + ", "+ j +" , "+ k + ", "+ m +" )";
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
		System.out.println("hashCode for :" + this+ "is" +hash);
		return hash;
	}

	public boolean equals(Object obj)
	{
		boolean flag = (obj instanceof A) &&
			(i == ((A)obj).i) &&
			(j == ((A)obj).j) &&
			(k == ((A)obj).k) &&
			(m == ((A)obj).m);
		System.out.println("equals b/w" + this + "and" + obj + ":" +flag);
		return flag;
	}
}
class M7
{
	public static void main(String[] args) 
	{
		A a1 = new A(90,80,70,100.8);
		A a2 = new A(70,80,70,100.8);
		A a3 = new A(90,80,170,100.8);
		A a4 = new A(90,170,80,100.8);
		A a5 = new A(90,170,180,100.8);
		A a6 = new A(180,170,90,100.8);
		HashSet set = new HashSet();
		set.add(a1);
		System.out.println("-------------");
		set.add(a2);
		System.out.println("-------------");
		set.add(a3);
		System.out.println("-------------");
		set.add(a4);
		System.out.println("-------------");
		set.add(a5);
		System.out.println("-------------");
		set.add(a6);
		System.out.println("-------------");
		System.out.println(set);
	}
}

/*
46735459
46735459
46782548
46782548

-hashCode() method representing same number if the order is different
-hashCode() is only for inquality conforming --unabble to conform equality.
-if two objects hash numbers are samne both onjects may be same or 
may not be same.to conform call
but in case of equals()-- it is same
*/