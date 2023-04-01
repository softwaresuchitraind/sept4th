class A
{

}
class M10 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		a2 = a1;//2nd object is becoming abadoned.
		System.out.println("done");
	}
}


/*

How many object/objects is abdoned ?

a2 is abadoned.

*/