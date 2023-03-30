import java.util.Arrays;
import java.util.stream.Stream;

class M6
{
	public static void main(String[] args) 
	{
		Integer[] elements = {10, 20, 40, 50, 111};
		Stream<Integer> stream1 = Stream.of(elements);
		stream1.forEach(System.out :: println);
		System.out.println("------------------");

		Double[] heights = {4.5, 5.9, 6.1, 5.7};
		Stream<Double> stream2 = Stream.of(heights);
		stream2.forEach(System.out :: println);

		String[] names = {"abc", "hello", "test"};
		Stream<String> stream3 = Stream.of(names);
		stream3.forEach(System.out :: println);
	}
}
