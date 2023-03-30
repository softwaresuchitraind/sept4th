class Y 
{
	int i;
	static Y test()
	{
	 Y y1=new Y();
	 y1.i=20;
	 return y1;
	}
	public static void main(String[] args) 
	{
		Y obj=test();
		System.out.println("Main"+obj.i);
	}
}
/*
y1 and obj pointing to same location
two references from different method
*/