import java.util.*;
class M53
{
	static class A
	{
		int i;
		A(int i)
		{
			this.i = i;
		}
		public String toString()
		{
			return "(i= " +i+ ")";
		}

	}
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue<>();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(901);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}