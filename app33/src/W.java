//static global
class W 
{
	static final int x;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
W.java:4: error: variable x not initialized in the default constructor
        static final int x;
                         ^
1 error
 -we are not providing value to x.cte
 -static global fields also should be assigned some value.otherwise we get
  compile time error.

*/