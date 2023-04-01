class G 
{
	public static void main(String[] args) 
	{
		try
		{
			
		}
		catch (Throwable ex)
		{
		}
		catch (Exception ex)
		{
		}
		catch (RuntimeException ex)
		{
		}
		catch (ArithmeticException ex)
		{
		}
	}
}

/*

G:\nov20th\exception\app4\src>javac -d ../classes G.java
G.java:12: error: exception Exception has already been caught
                catch (Exception ex)
                ^
G.java:15: error: exception RuntimeException has already been caught
                catch (RuntimeException ex)
                ^
G.java:18: error: exception ArithmeticException has already been caught
                catch (ArithmeticException ex)
                ^
3 errors


-Every exception/error is handled through 1st catch only.
*/
