class H 
{
	public static void main(String[] args) 
	{
		int i=100;
		byte b1=i;
		System.out.println("Hello World!");
	}
}
/*
cte
wider datatype while covverting to narrower datatype there is chance of data loss.
H.java:6: error: incompatible types: possible lossy conversion from int to byte
                byte b1=i;
                        ^
1 error
*/