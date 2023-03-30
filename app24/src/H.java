class A
{
	private int i;
}
class H extends A 
{
	public static void main(String[] args) 
	{
		H obj = new H();
		System.out.println(obj.i);
	}
}
//private members are not involved in the inheristance.
//private members are not inherited.