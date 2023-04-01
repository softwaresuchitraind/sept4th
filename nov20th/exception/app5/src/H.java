import java.io.Closeable;
class H implements Closeable 
{
	public void close()
	{
		System.out.println("from close");
	}
}

/*
Closable containing only close().
While interacting with file system and database closable statement are using.
once usage is got over u have to close without fail.

-In jdk 1.7 , a new concept is introduced in Exception handling
*/