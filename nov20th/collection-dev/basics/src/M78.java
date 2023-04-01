import java.util.Hashtable;
class M78
{
	public static void main(String[] args) 
	{
		Hashtable table = new Hashtable();
		System.out.println(table.put(22,"abc"));
		System.out.println(table.put(23,3.4));
		System.out.println(table.put(24,null));
		System.out.println(table);
	}
}

/*

NullPointerException--u can not choose null as value

HashMap---allows null element in key and value,It is non synchronized


HashTable---it wont allows null as key and null as value,it is synchronized

Sysnchronization---muliThreaded environment --use HashTable

*/