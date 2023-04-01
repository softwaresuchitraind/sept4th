import java.util.Hashtable;
class M77
{
	public static void main(String[] args) 
	{
		Hashtable table = new Hashtable();
		System.out.println(table.put(22,"abc"));
		System.out.println(table.put(null,3.4));
		System.out.println(table.put(24,'s'));
		System.out.println(table);
	}
}

//nullpointerException --u can not choose null as key