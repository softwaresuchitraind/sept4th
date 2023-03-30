import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class  M9
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(90);
		numbers.add(45);
		numbers.add(20);
		numbers.add(190);
		numbers.add(15);
		numbers.add(85);
		//System.out.println(numbers);
		
		List<Integer> r1 = numbers.stream().filter(t -> t < 60 ).collect(Collectors.toList());
		System.out.println(r1);

		long total1 = numbers.stream().filter(t -> t < 60).count();
		System.out.println(total1);
	}
}
