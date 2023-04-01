@FunctionalInterface
interface A
{
	int sum(int i,int j);
}
class M13  
{
	public static void main(String[] args) 
	{
		A a1 =(i,j) -> i+j;
		int i = a1.sum(10,20);
		System.out.println("done with" +i);
	}
}
/*
Annotations are used for providing some kind of descriptions.
it is allowed only to single method interface.
it is used for describing a annotation.


done with30



-Single method interfaces are called functional interfaces.
-Single method interfaces can be explicitely.
*/