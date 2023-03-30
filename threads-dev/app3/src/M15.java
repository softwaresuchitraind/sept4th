interface A
{
	void test(int i,int j);
}

class M15
{
	public static void main(String[] args) 
	{
		//if only one method then what is need of specifying data type	go for any identifier
		A a1=( x, y)-> 
							{

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