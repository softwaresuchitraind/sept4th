//Prime numbers between 1000 to 1 in reverse order
class A
{
	public static void main(String[] args) 
	{
		int num=1000;int j;
		for(int i=num;i>=2;i--)
		{
			boolean flag=true;
			for(j=2;j<=(i-1);j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(i+",");
			}
		}

		
	}
}
