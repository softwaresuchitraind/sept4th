class A 
{
	public static void main(String[] args) 
	{
		byte b1=100;
		short s1=b1;//short s1=(short)b1;
		int i=s1;
		double d1=i;//double d1=(double)i;
		double d2=s1;
		double d3=b1;
		System.out.println("Hello World!");
	}
}
/*
narrowing is converting to wider no data loss.
*/