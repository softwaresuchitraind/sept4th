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
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(10, 20);
		A a2 = new A(100, 200);
		System.out.println(a1);
		System.out.println(a2);
	}
}
/*

(i=10,j=20)
(i=100,j=200)
we are printing the content not the address
*/
