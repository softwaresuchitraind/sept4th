class W
{
	int i;
	static void test(W obj1, W obj2)//obj reference variable
	{
		System.out.println("from test1:"+obj1.i);
		System.out.println("from test2:"+obj2.i);
		obj1.i=20;
		System.out.println("from test3:"+obj1.i);
		System.out.println("from test4:"+obj2.i);
		obj2.i=30;
		System.out.println("from test5:"+obj1.i);
		System.out.println("from test6:"+obj2.i);
		obj2.i=40;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		W w1=new W();
		W w2=new W();
		w1.i=5;
		w2.i=15;
		test(w1,w2);
		System.out.println("Main End" +w1.i);
		System.out.println("Main End" +w2.i);
	}
}

/*
w1 and obj1 refering to same object
w2 and obj2 refering to same object
codescracker,com
*/