//print the fibonesis series from 500 to 100 in the reverse order
class B
{
	public static void main(String[] args) 
	{
		int i=0,j=1;
		int k=0;
		while((k=i+j)<500)
		{
			i=j;
			j=k;
		}
		System.out.println("fibonesis series in reverse order");
		System.out.print(j+ ",");
		while(i>0)
		{
		 i= k-j;
		 if ((i<=500)&(i>=100))
			System.out.print(i+ ",");
		 k=j;
		 j=i;
		}
		
	}
}

