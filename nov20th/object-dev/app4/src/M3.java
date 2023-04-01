class A
{
	static A obj;
	protected void finalize()
	{
		obj = this;
		System.out.println("from finalize()");
	}
}
class M3 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("I :" + A.obj);
		A a1 = new A();
		System.out.println("a1:" +a1);
		a1 = null;//abadoned
		Runtime.getRuntime().gc();
		Thread.sleep(10);
		System.out.println("2:" + A.obj);//resurrected--obj=this
		A.obj = null;//abadoned
		Runtime.getRuntime().gc();//not calling finalize() not calling second time for same object
		Thread.sleep(10);
		//bliendly removing from memory
		System.out.println("3:" + A.obj);
	}
}
/*
I :null
a1:A@70dea4e
from finalize()
2:A@70dea4e
3:null

This is the example demonstrating resurration

-if abandooned object is resurrected then finalize() method is not calling.


*/