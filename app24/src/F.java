class X
{
	private X()
	{
	
	}
}
class  F
{
	public static void main(String[] args) 
	{
		X x1=  new X();
		System.out.println("done");
	}
}
/*
CTE
private x()  can not called from another class.
if constructor declared as private you can not create object of it outside.
*/