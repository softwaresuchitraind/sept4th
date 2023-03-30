package pack1;
class B 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert true;
		System.out.println(2);
	}
}
/*
G:\sept4th\assert-dev\src>javac -d ../classes pack1/B.java

G:\sept4th\assert-dev\src>java -cp ../classes pack1.B
1
2
*/