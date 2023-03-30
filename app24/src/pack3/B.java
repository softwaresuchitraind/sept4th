package pack3;
class B 
{
	public static void main(String[] args) 
	{
		A a1= new A();
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
	}
}
/*

E:\sept4th\app24\src>javac -d ../classes pack3/A.java

E:\sept4th\app24\src>javac -d ../classes pack3/B.java

E:\sept4th\app24\src>java -cp ../classes pack3.B
0
0
0
within the current package all three can be used.
*/