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
G:\nov20th\assert-dev\src>javac -d ../classes pack1/B.java

G:\nov20th\assert-dev\src>java -cp ../classes pack1.B
1
2
G:\nov20th\assert-dev\src>java -cp ../classes -ea pack1.B
1
2
*/