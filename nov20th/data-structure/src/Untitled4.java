class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
	}
}
class Stack
{
	Node first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node(data);
			last = first;
		}
		else
		{
			last.next
		}
	}
}
class M24 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
