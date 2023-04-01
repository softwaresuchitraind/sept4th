class A < X >
{
	X obj;
}
class M33
{
	
	public static void main(String[] args) 
	{
		A <Integer> a1 = null;
		//a1 = new A<Integer>();//ctr
		//a1 = new A<String>();
		a1.obj = 30;
		System.out.println("done");
	}
}


/*

done

a1 always Integer as it is not taking any wildcard.

it is not taking any byte ,short, String etc always Integer

we can assign only int value to the obj.
*/