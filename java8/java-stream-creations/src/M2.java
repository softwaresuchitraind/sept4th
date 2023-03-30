import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
class  M2
{
	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<String>();
		set.add("abc");
		set.add("abc1");
		set.add("ab1c");
		set.add("a1bc");
		set.add("1abc");
		Stream<String> stream1 = set.stream();
		stream1.forEach(System.out :: println);
		
	}
}
