class A
{

}
class M9 
{
	public static void main(String[] args) 
	{
		A a1 = null;
		String s1 = "some thing " +a1;
		System.out.println(a1);
		System.out.println(s1);
	}
}

/*
null
some thing null

-Bacause a1 is null it is not calling a1.toString() while 
adding to sting
-if it is call it leds to cte
*/
