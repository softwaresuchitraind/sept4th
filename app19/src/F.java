class E
{
	static int x;
}

class F extends E
{
	static int y;
	public static void main(String[] args) 
	{
		System.out.println(F.x);
		System.out.println(F.y);
	}
}
/*
0
0
*/