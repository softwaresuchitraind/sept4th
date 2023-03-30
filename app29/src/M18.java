class M18
{
	public static void main(String[] args) 
	{
		A a1=new A();
		B b1=(B)a1;
		System.out.println(" done");
	}
}

/*
rte
only A class members are available.

Exception in thread "main" java.lang.ClassCastException: A cannot be cast to B
        at M18.main(M18.java:6)
*/