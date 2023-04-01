import java.util.PriorityQueue;
class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
 	}
}

class M33
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue(
								( o1, o2) -> ((A)o1).i -((A)o2).i);
		queue.add(new A(90));
		queue.add(new A(910));
		queue.add(new A(190));
		queue.add(new A(56));
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}

/*
[i = 56, i = 90, i = 190, i = 910]
i = 56

Whereever require Comparator we can use Lamda Expression

-comaparable and Comaparator both are functional interfafces
-contaoins only one method
-we need to supply comparator Object in second argument or Lamda Expression


for sorting
-----------
1-Every element should be sam e type.
-no null
-Comparator or comparable or lamda Expression
*/