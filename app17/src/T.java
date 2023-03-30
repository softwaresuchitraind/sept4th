//A class with 3 constructors
class T 
{
	T()
	{
		System.out.println("T()");
	}
	T(int i)
	{
		System.out.println("T(int)");
	}
	T(int i,int j)
	{
		System.out.println("T(int,int)");
	}

	public static void main(String[] args) 
	{
		T t1=new T();
		System.out.println("__________");
		T t2= new T();
	    System.out.println("__________");
		T t3= new T(30,40);
	    System.out.println("__________");

	}
}
/*
no matter all constructor is used or not.
compiler checks only the obj for constuctor
*/