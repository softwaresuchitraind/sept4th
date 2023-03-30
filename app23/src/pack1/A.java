package pack1;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("from pack1.A");
	}
}

/*

E:\sept4th\app23\src>javac -d ../classes pack1/A.java

E:\sept4th\app23\src>cd ../classes

E:\sept4th\app23\classes>java A
Error: Could not find or load main class A

E:\sept4th\app23\classes>java pack1.A
from pack1.A

E:\sept4th\app23\src>java -cp ../classes pack1.A
from pack1.A


*/