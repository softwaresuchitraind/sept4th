class P
{
	int i;
	public static void main(String[] args) 
	{
		P p1 = new P();
		System.out.println(p1.i);
		P p2=p1;//a new refernce p2
		p1.i=20;
		System.out.println(p1.i);
		System.out.println(p2.i);
	}
}

/*
p1 and P2 refered to same object
one object can have any number of reference variable

*/
