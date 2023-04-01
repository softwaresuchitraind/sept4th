import java.util.ArrayList;
import java.util.Collections;
class A implements Comparable< A >
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i =" + i;
	}
	public int compareTo(A obj)
	{
		return i - obj.i;
	}
}
class M70 
{
	public static void main(String[] args) 
	{
		ArrayList <A> list = new ArrayList<>();
		list.add(new A(90));
		list.add(new A(0));
		list.add(new A(9));
		list.add(new A(910));
		list.add(new A(190));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

/*
Only A type is allowed other than A type is not allowed.

G:\nov20th\generics-dev\src>java -cp ../classes M70
[i =90, i =0, i =9, i =910, i =190]
[i =0, i =9, i =90, i =190, i =910]


*/