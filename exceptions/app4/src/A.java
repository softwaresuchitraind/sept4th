class A 
{
	void test1()
	{
	}
	void test2()throws ClassNotFoundException
	{
	}
	void test3()throws NullPointerException
	{
	}
	void test4()throws CloneNotSupportedException
	{
	}
	void test5()throws java.io.IOException
	{
	}
	void test6()throws Exception
	{
	}
	
}
/*
-Any method can be overided without a throws in the subclass
-Any method can be overide in the subclass by choosing throws and checked.
-Any method can overided by choosing throws unchecked.
-test1() can not be overided in the subclass by choosing throws.
-test2() can be overied by classnotfoundexception or subclass to classnotfound exception.
-test3() can not be overied in checked,
-test4() can be overided ClonenotSupported Exception not classnotfound or any other checked.
-test5() can be overided either IO or subclass to IO.
-Every checked exception in case of test6()------




*/
