class F 
{
	public static void main(String[] args) 
	{
		final int[] x = new int[3];
		x[2] = 20;
		System.out.println("done");
	}
}

/*
x is final, we are not modified x
index no 2 is modified
*/
