class A
{
	String obj;
}
class M3 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.obj = "hello";

		A a2 = new A();
		a2.obj = "test";
		System.out.println("done");
	}
}

//in every object of A,Obj datatype is String
//we can assign only string value,in every object of A
//done