import java.util.ArrayList;
class M102
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9.5);
		list.add("abc");
		System.out.println(list);
		Object obj = list.get(1);
		System.out.println(obj);
		double d1 = (Double)list.get(2);
		System.out.println(d1);
	}
}