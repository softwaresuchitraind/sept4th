import java.util.HashSet;
class A
{
	int i,j,k;
	A(int i,int j,int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString()
	{
		return "("+ i +","+j+","+k+")";
	}
	public int hashCode()
	{
		int hash = Integer.toString(i).hashCode();
		hash += Integer.toString(j).hashCode();
		hash += Integer.toString(k).hashCode();
		System.out.println("hashCode for" +this+ ":"+hash);
		return hash;
	}
	public boolean equals(Object obj)
	{
		boolean flag = (obj instanceof A)&&
						(i==((A)obj).i) &&
						(j ==((A)obj).j) &&
						(k == ((A)obj).k);
		System.out.println("equals b/w" +this+ "and" +obj+ ":"+flag);
		return flag;
	}
}
class M41
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		System.out.println(set.add(new A(90,120,40)));
		System.out.println("---------------------");
		System.out.println(set.add(new A(90,120,40)));
		System.out.println("----------------------");
		System.out.println(set.add(new A(90,120,40)));
		System.out.println("------------------------");
		System.out.println(set.add(new A(90,120,40)));
		System.out.println("------------------------");
		System.out.println(set.add(new A(120,40,90)));
		System.out.println("------------------------");
		System.out.println(set.add(new A(120,40,90)));
		System.out.println("------------------------");
		System.out.println(set.add(new A(120,140,190)));
		System.out.println("------------------------");
		System.out.println(set.add(new A(140,120,190)));
		System.out.println("------------------------");
		System.out.println(set.add(null));
		System.out.println("------------------------");
		System.out.println(set.add(null));
		System.out.println("------------------------");
		System.out.println(set.add(null));
		System.out.println("------------------------");
		System.out.println(set.size());
		System.out.println(set);
	}
}
/*
-Inside hashSet storing elemnts in the bucket.
-Every bucket is assigning with unique hash Number.

-Internally it is using linked list
-HashCode method internally calling if other than null,
if element is null bliendly choosing one bucket for null element.

_two null elements are duplicates it is not storing

*/
