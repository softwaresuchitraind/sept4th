@interface Versions
{
	int[] allVersions();
}

@Versions (allVersions={12,13})
public class C
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
