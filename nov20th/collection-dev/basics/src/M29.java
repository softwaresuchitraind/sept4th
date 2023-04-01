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
class M29  
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
classCastException ---Why ?
for comparision purpose queue should be Comaparable type.


-Elements are not comparable type.


*/