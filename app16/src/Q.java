class Q 
{
	int i;
	public static void main(String[] args) 
	{
		Q q1= new Q();
		Q obj=q1;
		Q q3=obj;
		Q ref=q1;
		q3.i=30;
		System.out.println(q1.i);
		System.out.println(q3.i);
		System.out.println(obj.i);
		System.out.println(ref.i);
	}
}
/*
All are referncing to same object
30
30
30
30
*/
