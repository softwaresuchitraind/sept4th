class  A
{
	private int i=10;
	public static void main(String[] args) 
	{
		A a1= new A();
		System.out.println(a1.i);
	}
}
/*
i can not be accessed outside in the class A as i is private.
private members should be used in the same class.
We can not use private members of one class with another class.
*/