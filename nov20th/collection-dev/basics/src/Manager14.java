import java.util.ArrayList;
class Manager14 extends ArrayList
{
	public static void main(String[] args) 
	{
		Manager14 list = new Manager14();
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(10);
		list.add(20);
		list.add(8);
		System.out.println(list);
		list.removeRange(2,6);
		System.out.println(list);
	}
}

/*

[1, 0, 3, 4, 7, 9, 10, 20, 8]
[1, 0, 10, 20, 8]


index 2 is inclusive and 6 is exclusive

-removeRange() is a protected method in the Arraylist--that can not be called
Straigtway by using ArrayList reference variable.
-without subclass development we can not use removeRange()

*/
