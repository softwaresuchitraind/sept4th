class F
{
	int i;
	void test1()
	{
		System.out.println("from test1 "+i);//compiler replaces this.i
		i=10;
		test2();//compiler takes  this.i
	}
	void test2()
	{
		System.out.println("from test2 "+i);
		i=20;// not required refernce variable
	}
	public static void main(String[] args) 
	{
		F f1= new F();
		f1.i=30;
		System.out.println("From main1 " +f1.i);
		f1.test1();//this is e1 inside test1()
		System.out.println("from main2 "+f1.i);
		f1.i=40;
		f1.test2();
		System.out.println("from main3 "+f1.i);
	}
}

/*
this is available in test1 and test2 there is no need to specify
compiler automatically sepcify.
not only syntax varification  and generating a class file by compiler-
-it also replaces some code
we can using one non static methods with other straight way.

......................
Every non static member should use refernce variable as when object is created non static members loaded into memory.
In case of static defination block no default refernce variables you have to create your own refernce variable.
In every non static defination block default this is available automatically compiler consider it we need not 
specify it explicitly.

before object creation class is loading to the memory.
we can call static members inside a nonstatic block through class name
static members can be used anywhere through class name

*/