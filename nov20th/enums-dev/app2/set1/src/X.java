class X 
{
	enum A
	{
		CON(100), TEST(200);
		A(int i)
		{
			System.out.println("A(int) :" +i);
		}
	}
	public static void main(String[] args) 
	{
		A a1 = A.TEST;
		System.out.println(a1);
	}
}

/*
A(int) :100
A(int) :200
TEST

- if no constructor u get cte
-enum constructor can take argument,we have to provide constructor with argument constructor.

-In case of object creation switable constructor is required.


*/