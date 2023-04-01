/*
26. Read only odd indexed elements from an array?
*/
class Z
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,12};
		for(int i=1;i<x.length;i+=2)
		{
			System.out.print(x[i]+ ",");
		}
	}
}
