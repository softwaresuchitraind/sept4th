
import java.util.ArrayList;
import java.util.Collections;
class Manager19
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(8.9);
		list.add(9);
		list.add(9.0);
		list.add(9.1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
/*

ClassCastException
-In entire collection API we can not storeing primitive values.
-Collection API is not for storing primitive values
-While attemoting to store primitibves boxing into wrppper Object upcasted upto Object
-in jdk 1.4 u will get cte there is no autoboxing
-how we can compare double object with interger object

-Every wrapper class is subclass to Comparable interface


*/
