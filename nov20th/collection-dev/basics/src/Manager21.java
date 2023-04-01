import java.util.ArrayList;
class A
{
	int i;
	A(int i)
	{
		this.i =i;
	}
}
public class Manager21
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(90);
		list.add(new A(100));
		list.add(new A(200));
		System.out.println(list);
	}
}


/*

[abc, 90, A@7852e922, A@4e25154f]

In every Collection API-

toString()
hashCode()
equals()
method got overided


*/
