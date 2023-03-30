class R 
{
	int i;
	public static void main(String[] args) 
	{
		R r1= new R();
		R r2= new R();
		System.out.println(r1.i);
		System.out.println(r2.i);
		r1.i=10;
		r2.i=20;
		System.out.println(r1.i);
		System.out.println(r2.i);

	}
}
/*
two objects are created
non static---how many numbers of objects are created
for one object any number of references
*/
