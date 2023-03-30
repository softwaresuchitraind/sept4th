class A
{
	private A()
	{
	
	}
}
class G extends A 
{
	public static void main(String[] args) 
	{
		System.out.println("done ");
	}
}
/*
from G() to there is a call to A() which is private.
CTE
*/