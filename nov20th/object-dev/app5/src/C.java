class C implements Cloneable 
{
	int i;
	public static void main(String[] args) 
		throws CloneNotSupportedException
	{
		C obj1 = new C();
		obj1.i	= 90;

		C obj2	=(C)obj1.clone();
		System.out.println(obj2.i);
		obj1.i =190;
		System.out.println(obj2.i);
	}
}

/*
90
90
-After performing the cloning --
---if u change in oriugional object-that change is not affected
-whenever u are cloning object members are copying into
origional object

-here cloneing


both objects are different ,changes in onne not affecting other
*/