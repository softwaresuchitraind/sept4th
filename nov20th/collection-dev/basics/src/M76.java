import java.util.Hashtable;
class M76
{
	public static void main(String[] args) 
	{
		Hashtable table = new Hashtable();
		System.out.println(table.put(22,"abc"));
		System.out.println(table.put(23,3.4));
		System.out.println(table.put(24,'s'));
		System.out.println(table);
	}
}

/*

null
null
null
{24=s, 23=3.4, 22=abc}
-Under Map HasTable is there
-HashTable also Map type

-Differnce beteen HashTBle and HashMap

--HashTable wont allow null as value and null as key



*/