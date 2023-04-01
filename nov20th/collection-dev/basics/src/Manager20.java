import java.util.ArrayList;
import java.util.Collections;
public class Manager20
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("aBC");
		list.add("ABC");
		list.add("abc");
		list.add("ABc");
		list.add("123");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

/*

[abc, aBC, ABC, abc, ABc, 123]
[123, ABC, ABc, aBC, abc, abc]

All are String type we can sort successfully
after sorting we get first digits then upper case and lower case
it is based on ASCII codes
All are same type of elements
*/
