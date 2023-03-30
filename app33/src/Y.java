class Y
{
	static final int x =0;
	public static void main(String[] args) 
	{
		x = 0;
		System.out.println("done");
	}
}
/*
Y.java:6: error: cannot assign a value to final variable x
                x = 0;
                

-Attempting to reinitialize
*/