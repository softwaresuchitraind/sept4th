package pack3;
class C extends A
{
	public static void main(String[] args) 
	{
		C c1= new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
	}
}
/*
E:\sept4th\app24\src>javac -d ../classes pack3/C.java

E:\sept4th\app24\src>java -cp ../classes pack3.C
0
0
0
*/