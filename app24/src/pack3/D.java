package pack3;
class D 
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

E:\sept4th\app24\src>javac -d ../classes pack3/D.java

E:\sept4th\app24\src>java -cp ../classes pack3.D
0
0
0
*/