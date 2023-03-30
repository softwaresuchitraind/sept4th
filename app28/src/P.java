class P 
{
	public static void main(String[] args) 
	{
		double d1=2.5;
		int i=d1;
		System.out.println(i);
		System.out.println("Hello World!");
	}
}
/*
H.java:6: error: incompatible types: possible lossy conversion from int to byte
                byte b1=i;
                        ^
1 error
*/