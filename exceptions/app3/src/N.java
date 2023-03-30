class N 
{
	public static void main(String[] args) 
	{
		try
		{
			
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		
	}
}

/*

G:\sept4th\exceptions\app3\src>javac -d ../classes N.java
N.java:9: error: exception ClassNotFoundException is never thrown in body of corresponding try statement
                catch (ClassNotFoundException ex)
                ^
1 error

compiler knows all the state checked ----no class.forname();

*/
