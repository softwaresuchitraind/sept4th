//fibonesis series upto 500 to 100 in   reverse order
class B1 
{
	public static void main(String[] args) 
	{
		int i=0,j=1,k;
		//System.out.print(i+" ," +j);
		while((k=i+j)<100)
		{
			//System.out.print(" ,"+k);
			i=j;
			j=k;
		}
		System.out.println(j);
		while(i>0)
		{
			i=k-j;
			if((i>=100)&(i<=500))
			{
			System.out.println(i);
			}
			k=j;
			j=i;

		}

	}
}
