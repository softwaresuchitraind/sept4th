class M38 
{
	public static void main(String[] args) 
	{
		A b1=new B();
		b1.test1();
		System.out.println(b1.i);
		b1.test2();
		System.out.println(b1.j);
	}
}
/*
cte
while compiling compiler will check the refernce type--no matter what is  the object type
b1 datatype is Atype.
inside A---j and test2() is not available
*/