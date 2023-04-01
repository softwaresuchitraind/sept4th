class D implements Cloneable 
{
	int i;
	public static void main(String[] args) 
		throws CloneNotSupportedException
	{
		D obj1 = new D();
		obj1.i	= 90;

		D obj2	=(D)obj1.clone();
		System.out.println(obj2.i);
		obj2.i =190;
		System.out.println(obj1.i);
	}
}

/*
90
90

-deep copy---changes is not affected-
-After copying origional object is cloning into cloned
object--this type of cloning is called deep copy operation.


changes in the duplicate not reflecting to duplicates and 
changes in the or
origional not reflecting to duplicates.This is called deep copy cloning.


*/