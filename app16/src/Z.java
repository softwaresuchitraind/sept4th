class Z 
{
	int i;
	static Z test(Z obj)
	{
		Z obj1= new Z();
		obj1.i=obj.i*2;
		return obj1;
	}
	public static void main(String[] args) 
	{
		Z z1= new Z();
		z1.i=10;
		Z z2 = test(z1);
		System.out.println("main :"+z1.i);//it is not modified
		System.out.println("main : "+z2.i);
	}
}
/*
o/p
10
20
for different object different memory is allocated
*/