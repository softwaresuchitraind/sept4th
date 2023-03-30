class M13
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
		t1.setDaemon(true);//converted child as daemon
		t1.start();
		System.out.println("done");
	}
}

/*it execute till parent exit,child exit
Daemon thread leaving its execution whenever its parent is leaving.
*/