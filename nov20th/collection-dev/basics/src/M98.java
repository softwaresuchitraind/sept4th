import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
class M98 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc" ,300);
		map.put("test" ,505);
		map.put("xyz" ,500);
		map.put("hello" ,34);
		map.put("hello1" ,774);
		map.put("hello2" ,200);
		map.put("hello2" ,600);
		System.out.println(map);
		TreeMap map1 = new TreeMap(map);
		System.out.println(map1);
		// it is reading all the elements---createing one entry Object
		Set entries = map.entrySet();



		/*
		//Anonymous Inner class
		TreeSet set1 = new TreeSet(
		 new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				Integer value1 = (Integer)e1.getValue();
				Integer value2 = (Integer)e2.getValue();
				return value1.compareTo(value2);
			}
		});

		*/

		//lamda expressions
		TreeSet set1 = new TreeSet(
		  (o1,o2) -> ((Integer)(((Map.Entry)o1).getValue())).
			compareTo(((Integer)(((Map.Entry)o2).getValue()))));
		
		set1.addAll(entries);
		System.out.println(set1);

	}
}

/*
Sorting Mapcontent based on values


{abc=300, test=505, hello1=774, xyz=500, hello2=600, hello=34}
{abc=300, hello=34, hello1=774, hello2=600, test=505, xyz=500}
[hello=34, abc=300, xyz=500, test=505, hello2=600, hello1=774]


- If u r using treeMap sorting are based on keys,

*/