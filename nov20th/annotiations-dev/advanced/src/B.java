@interface Authors
{
	String[] list();
}

@Authors(list={"ramana","kiran"})
public class B 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
