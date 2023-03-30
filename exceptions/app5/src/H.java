import java.io.Closeable;
class  H implements Closeable
{
	public void close()  
	{
		System.out.println("from close");
	}
}

/*
Closable interface containing a close() method
*/