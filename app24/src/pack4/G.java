package pack4;
class G
{
	public static void main(String[] args) 
	{
		
		F f1= new F();
		System.out.println(f1.j);//protected can not be used outside the subclass.
		System.out.println(f1.k);
	}
}
/*
protected while inhriting to subclass of another package
it should be used within the subclass,it can not be used outside the class.
While public members inheriting to another can be used another,

Actual protected comes into picture while it is inhering to subclass of another package.

*/