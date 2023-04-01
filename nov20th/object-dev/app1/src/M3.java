class A
{
	int i;
}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i =10;

		A a2 = a1;
	
		System.out.println(a1);
		System.out.println(a2);
	}
}
/*

A@15db9742
A@15db9742

a1 and a2 both are pointing to same object.
-object is removed from memory by garbage collector.

-Garbage collector is take care of relesing of memory.
-we are not bothring about how to  remove due to garbage collector-
-how much memory is 
alocated --how to remove


*/