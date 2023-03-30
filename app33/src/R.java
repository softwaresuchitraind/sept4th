class R 
{
	final int i=10;
	public static void main(String[] args) 
	{
		R r1=new R();
		r1.i=20;
		System.out.println("done");
	}
}
/*
R.java:7: error: cannot assign a value to final variable i
                r1.i=20;
                  ^
once object get created we can not modify.
*/