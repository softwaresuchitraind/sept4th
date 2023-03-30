class M12
{
	public static void main(String[] args) 
	{
		Runnable r1=() -> {

			for(int i=1;i<1000;i++)
			{
				System.out.println("run:"+i);
			}
		};

		Thread t1=new Thread(r1);
		t1.start();
		System.out.println("done");
	}
}
/*

even though parent is left from execution very early.

*/