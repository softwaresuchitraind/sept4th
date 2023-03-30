class K 
{
	int p,q,r;
	K()
	{
		System.out.println("k() "+p+", "+q+ "," +r);
		p=q=r=20;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		K obj= new K();
		System.out.println("Main : "+obj.p+", "+obj.q+","+obj.r);
		System.out.println("Main begin");
	}
}

/*
constructor is one of the initializer
*/
