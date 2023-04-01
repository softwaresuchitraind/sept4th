class M7 
{
	public static void main(String[] args) 
	{
		int[] x = new int[5];
		System.out.println(x[5]);
	}
}
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at M7.main(M7.java:6)

-Last index is not void
-indexs are starting from 0
*/