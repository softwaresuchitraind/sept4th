/*
33. Reverse only even indexed of the elements of given array? 
*/
class Z7
{
	public static void main(String[] args) 
	{
		int []x={3,6,1,10,4,6,9,12,8,7};
		//		  0 1 2 3 4 5 6  7 8 9 10
	
		System.out.println("initial array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();

		int lastEvenIndex=
			x.length%2 == 0 ? x.length - 2 : x.length -1 ;

		for(int i=0;i<x.length/2;i+=2,lastEvenIndex-=2)
		{
			
			if ( i== lastEvenIndex)
			{
				continue;
			}
			x[i] = x[i] + x[lastEvenIndex-i-1];
			x[lastEvenIndex-i-1]= x[i]- x[lastEvenIndex-i-1];
			x[i] = x[i]- x[lastEvenIndex-i-1];
		}

		System.out.println("final array content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+ ", ");
		}
		System.out.println();
	}
}
