interface A
{
	void test(int i,int j);
}

class M14
{
	public static void main(String[] args) 
	{
		
		A a1=(int x,int y)-> {

								System.out.println("lamda.test(): " +x);
								System.out.println("lamda.test() : " +y);
						
							};
		
		a1.test(10,20);
		System.out.println("done");
	}
}
/*
lamda.test(): 10
lamda.test() : 20
done
*/