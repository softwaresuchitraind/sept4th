class H 
{
	public static void main(String[] args) 
		throws ClassNotFoundException
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);
	}
}
/*
cs
throws keyword is only for checked Exception
for unched it does not require at all.
*/