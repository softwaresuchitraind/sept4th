class Y
{
	Y(int i,int j)
	{
		System.out.println("Y(int,int)");
	}
}
class Z extends Y
{
	Z()
	{
		super(10,20);
	}
	
	public static void main(String[] args) 
	{
		Z z1= new Z();
		System.out.println(" Done");
	}
}