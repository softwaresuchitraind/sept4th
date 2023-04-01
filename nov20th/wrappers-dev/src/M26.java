class M26
{
	static void test(int ... args)
	{
		System.out.println("var arg");
	}
	public static void main(String[] args) 
	{
		test();
		test(1);
		test(2,4);
		test(40,10);
		System.out.println("done");
	}
}

/*

in jdk 1.5 var ages---variable number of arguments concept was introduced
syntax
(int ... args)

if method contains var args u can supply any number of arguments
including 0s
for all these calling statements


G:\nov20th\wrappers-dev\src>java -cp ../classes M26
var arg
var arg
var arg
var arg
done

*/