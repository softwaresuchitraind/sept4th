package pack1;
class D 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i=10;
		assert i==10;
		System.out.println(2);
	}
}
/*

G:\sept4th\assert-dev\src>javac -d ../classes pack1/D.java

G:\sept4th\assert-dev\src>java -cp ../classes -ea pack1.D
1
2

G:\sept4th\assert-dev\src>java -cp ../classes -ea pack1.D
1
2

*/