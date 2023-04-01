import java.util.PriorityQueue;
class A implements Comparable
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
	public int compareTo(Object obj)
	{
		return i - ((A)obj).i;
	}
}
class M30 
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
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


we can sort the elements in the container

Objects of A we can store in the priority Queue...

*/