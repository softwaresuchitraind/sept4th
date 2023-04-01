class A1
{

	private transient boolean isExecuted= false;

	public static void main(String[] args) 
	{
		System.out.println("Main begin");
	
		if (!isExecuted)
		{
			captureActivityLog();
		}
		
		System.out.println("main End");
	}
	public  void captureActivityLog1()
	{
		if (!isExecuted)
		{
			captureActivityLog();
		}
		
	}
	synchronized  private  void captureActivityLog()
	{
		A1.isExecuted=true;
		System.out.println(A1.isExecuted);
	}
}
