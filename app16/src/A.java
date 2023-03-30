class A 
{
	int i;//i is non static
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
-Compile time error
-non static member can not insert into static as main is static
*/