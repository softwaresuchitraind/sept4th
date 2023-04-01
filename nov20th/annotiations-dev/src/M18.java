import java.util.ArrayList;

//in throughout the class where ever unchecked is there it ignores
@SuppressWarnings("unchecked")
class M18 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(90);
		list.add(90);
		System.out.println(list);
	}
}

/*
two compile time notes


G:\nov20th\annotiations-dev\src>javac -d ../classes -Xlint:unchecked M18.java

3 warnings


-In case of Arraylist we have generic 
we are not using --add() argument is a Object type 

-Whenever method argument is Object
-if method argument is Object type compiler


*/
