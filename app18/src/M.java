//How many objects are created through IIB
class M
{
	static int counter;
	M()
	{
		
	}
	M(int i)
	{
		
	}
	M(int i,int j)
	{

	}
	{
		counter++;
	}
	public static void main(String[] args) 
	{
		M obj1=new M();
		M obj2=new M();
		M obj3=new M(20);
		M obj4=new M(2,5);
		M obj5=new M(40);
		M obj6=new M(3,5);
		M obj7=new M(50);
		System.out.println(M.counter);
	}
}
