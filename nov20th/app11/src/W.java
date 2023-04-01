/*
23. Read second half of the elements in the reverse direction from an array?
*/
class W
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,12};
		for(int i=x.length-1;i>=(x.length/2);i--)
		{
			System.out.print(x[i]+ ",");
		}
	}
}
