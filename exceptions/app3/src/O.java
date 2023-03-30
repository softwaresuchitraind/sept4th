class O 
{
	public static void main(String[] args) 
	{
		try
		{
			int i=10;
			System.out.println(i);
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		
	}
}
/*

G:\sept4th\exceptions\app3\src>javac -d ../classes O.java
O.java:10: error: exception ClassNotFoundException is never thrown in body of corresponding try statement
                catch (ClassNotFoundException ex)
                ^
1 error

there is no classNotFoundException in try block.
try can be empty if every catch is unchecked.

try can not be empty if any one catch is taking checked.
*/