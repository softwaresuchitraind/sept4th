import java.util.ArrayList;
import java.util.function.Consumer;
class  M2
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(123);
		list1.add(1000);
		list1.add(1);
		list1.add(45);
		list1.add(50);
		ListConsumer consumer = new ListConsumer();
		list1.forEach(consumer);
		
	}
}
class ListConsumer implements Consumer<Integer>
{
	public void accept(Integer obj)
	{
		System.out.println("consuming:" +obj);
	}
}
