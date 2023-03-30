class U
{
	U(int i,int j)
	{
		System.out.println("U(int,int)");
	}
}
class V extends U
{
	V(int i, int j)
	{
		
		System.out.println("V(int,int)");
	}

	public static void main(String[] args) 
	{
		V v1=new V(10,90);
		System.out.println(" Done");
	}
}
//compile time error