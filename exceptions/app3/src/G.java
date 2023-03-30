class G
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			Class.forName("");//we have to supply name of the class
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		System.out.println(2);
		
	}
}
/*
1
ex
2
while running exception arises
*/