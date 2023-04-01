class D
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		C c1 = new C();
		System.out.println("done");
	}
}

/*
cte


D.java:11: error: non-static variable this cannot be referenced from a static context
                B b1 = new B();
                       ^
1 error


-without a reference variable we can not use 
non-static member inside static main


-B class can be used in main() for datatype purpose
-We can not use non-static in the static context 
straight way.



*/