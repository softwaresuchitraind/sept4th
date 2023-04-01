enum V
{
	C1, C2, C3;
	V()
	{
		System.out.println("V()");
	}
}
class W 
{
	public static void main(String[] args) 
	{
		V v1 = V.C3;
		System.out.println(v1);
	}
}

/*
- inside enum minimum one constructor is required --if not providing compiler providing a default constructor.
- to use any member of enum enum has to load into the memory
-while loading every static members has to load.
-to use c3 enum should be availbale in the memory.
-enums are mainily for constants.



*/
