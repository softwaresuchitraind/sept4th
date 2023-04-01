//	How we can make deep copy operation even though class A 
//contains shallow copy ?
class A
{
	int x;
	A(int x)
	{
		this.x	= x;
	}
}
class G implements Cloneable 
{
	int i;
	A a1;
	protected Object clone() throws CloneNotSupportedException
	{
		G obj	= (G)super.clone();
		obj.a1	= new A(a1.x);
		return obj;
	}
	public static void main(String[] args)
		throws CloneNotSupportedException
	{
		G obj1	= new G();
		obj1.i	= 90;
		obj1.a1 = new A(10);

		G obj2	= (G) obj1.clone();
		System.out.println(obj2.i);
		System.out.println(obj2.a1.x);

		obj1.i = 190;
		obj1.a1.x = 20;
		System.out.println(obj2.i);
		System.out.println(obj2.a1.x);

	}
}

/*

90
10
90
10
Deep copy
*/