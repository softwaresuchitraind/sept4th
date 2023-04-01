class A 
{
	int i;
	int j;
	A(int i,int j)
	{
		this.i =i;
		this.j =j;
	}
	public String toString()
	{
		return "(i=" +i+",j="+j+ ")";
	}
}
class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A(10, 20);
		A a2 = new A(100, 200);
		String s1 = "state of a1:" +a1;
		String s2 = "state of a2:" +a2;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(s1);
		System.out.println(s2);
	}
}
/*
(i=10,j=20)
(i=100,j=200)
state of a1:(i=10,j=20)
state of a2:(i=100,j=200)

-while adding string to anything internally toString() method is calling.
-internally toString method is called ,here it is overided.

-Whenever u r printing or adding toString() method is called.

*/
