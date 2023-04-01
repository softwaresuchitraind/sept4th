class M19 
{
	public static void main(String[] args) 
	{
		Short obj1 = new Short((short)20);
		Integer obj2 = new Integer(20);
		obj2 = obj1;
		System.out.println("done");
	}
}
/*

cte
autowidening is only for primitives.
*/