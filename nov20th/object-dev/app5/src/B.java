class B implements Cloneable 
{
	int i;
	public static void main(String[] args) 
		throws CloneNotSupportedException
	{
		B obj1 = new B();
		obj1.i	= 90;

		B obj2	=(B)obj1.clone();
		System.out.println(obj2.i);
	}
}
/*

90
-Alreay there is a prdefined clone() is availbble--
copying the origional object
creating duplicate
*/