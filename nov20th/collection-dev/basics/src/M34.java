import java.util.PriorityQueue;
class Person
{
	String name;
	Integer age;
	Person(String name, Integer age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return "(" +name+ "," +age+ ")";
 	}
}

class M34
{
	public static void main(String[] args) 
	{
		PriorityQueue queue1 = new PriorityQueue(
	( o1, o2) -> ((Person)o1).name.compareTo(((Person)o2).name));
		queue1.add(new Person("Hello", 90));
		queue1.add(new Person("abc", 910));
		queue1.add(new Person("test", 190));
		queue1.add(new Person("check",56));
		System.out.println(queue1);
		System.out.println(queue1.poll());

		
		PriorityQueue queue2 = new PriorityQueue(
	( o1, o2) -> ((Person)o1).age.compareTo(((Person)o2).age));
		queue2.add(new Person("Hello", 90));
		queue2.add(new Person("abc", 910));
		queue2.add(new Person("test", 190));
		queue2.add(new Person("check",56));
		System.out.println(queue2);
		System.out.println(queue2.poll());
	}
}

/*
[(Hello,90), (abc,910), (test,190), (check,56)]
(Hello,90)
[(check,56), (Hello,90), (test,190), (abc,910)]
(check,56)

-Every werpper class is asubclass to Comparable use comparable.
*/