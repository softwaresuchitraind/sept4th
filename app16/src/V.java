class V
{
	int i;
	static void test(V obj)//obj reference variable
	{
		System.out.println("from test:"+obj.i);
		obj.i=20;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		V v1=new V();
		v1.i=10;
		test(v1);//V type var
		System.out.println("Main End" +v1.i);
	}
}
/*
v1 and obj refering to same object
object can have any refernce variable

*/
