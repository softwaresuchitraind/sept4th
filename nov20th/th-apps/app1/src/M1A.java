class M1A 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Hello World!");
		//Util.sleep(10000);
		M1A a = new M1A();
		a.getAddOrReplace();
	}
	public  void getAddOrReplace() throws Exception
	{
			try
		{
			M1A a = new M1A();
			System.out.println("Hi123");
			Thread.sleep(1000);
			a.updateClearanceStatus();
			Thread.sleep(1000);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
			
	}
	public void updateClearanceStatus() throws Exception
	{
		
		System.out.println("Hi");
	}

}
