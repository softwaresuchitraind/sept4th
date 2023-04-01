/*
25. Read only even indexed elements from an array in the reverse order? 
*/
class Y
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,12};
		int end = x.length % 2 == 0 ? (x.length - 2) :(x.length-1);
		for(int i=end;i>=0;i-=2)
		{
			System.out.print(x[i]+ ",");
		}
	}
}
