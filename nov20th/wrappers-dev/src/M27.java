class M27
{
	static void test(int ... args)
	{
		System.out.println("var arg :" + args.length);
	}
	public static void main(String[] args) 
	{
		test();
		test(1);
		test(2,4);
		test(40 ,10 ,5);
		test(40 ,10 ,5, 45, 100);
		System.out.println("done");
	}
}
/*

G:\nov20th\wrappers-dev\src>java -cp ../classes M27
var arg :0
var arg :1
var arg :2
var arg :3
var arg :5
done


by default all the elements are store in array
var arg argument is array by default.
*/