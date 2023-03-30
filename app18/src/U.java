class U 
{
	U()
	{
		this(990);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


/*
U.java:5: error: constructor U in class U cannot be applied to given types;
                this(990);
                ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
1 error


-this calling statement to be avalable

*/