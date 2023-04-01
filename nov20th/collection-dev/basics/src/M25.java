import java.util.PriorityQueue;
class M25  
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(20);
		queue.add(0);
		queue.add(200);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
/*
G:\nov20th\collection-dev\src>java -cp ../classes M25
[0, 20, 190, 910, 90, 200]
0
[20, 90, 190, 910, 200]
20
[90, 200, 190, 910]

it identifies the least element,the least element is 1st element.
priority queue guarented 1st elemnt is a sorted one-No other elements.
-There is no chance of reading or removing other than 1st element.
-it is a perfect queue only chances are there to read and remove 1st element.
under List only index is there.
Arraylist,Vector
u can not use get method here




-In priority queue sorting is only in the 1st element.
-Entire content is not sorting,the least element guaraented the 1st element.
-only head element is sorted one.
-Pripority queue is a perfect queue.
-priority queue is guarented only 1st element is a sorted one among all.
-in priortiy queue there is no chance of removing or reading after from the 1st element.
-if nobody is able to read after 1st element there is no need to sort.
-Under list only index is there.
-u can not use get method here.


u can only usse peek() or pool()
peek()--reading the head
pool()--reading and removing head element
-There is no getMethod here



*/