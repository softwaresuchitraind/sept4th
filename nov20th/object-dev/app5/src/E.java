class E implements Cloneable 
{
	int i;
	String s1;
	public static void main(String[] args) 
		throws CloneNotSupportedException
	{
		E obj1 = new E();
		obj1.i	= 90;
		obj1.s1	= "abc";

		E obj2	=(E) obj1.clone();
		System.out.println(obj2.i);
		obj2.i =190;
		obj2.s1 = "xyz";
		System.out.println(obj1.i);
		System.out.println(obj1.s1);
	}
}

/*
90
90
abc

deep copy---here obj1 object containing i and s1
While developing duplicate if duplicate is indepedent then the process
used called deep copy operation.

String is immutable.
changes is not affected
-deep copy cloning is guaranterd if atrributes
are primitives and  immutable.
-String inside wrapper is immutable.
*/