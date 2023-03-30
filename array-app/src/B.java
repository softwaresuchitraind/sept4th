class B

{
	public static void main(String[] args) 
	{
		int []x={10,20,30,4,50,6,70};
		for(int i=0;i<x.length;i++)
		{
		System.out.print(x[i] + ",");
		}
		System.out.println();
		for(int i:x)
		{
		System.out.print(i+",");
		}
	}
}
