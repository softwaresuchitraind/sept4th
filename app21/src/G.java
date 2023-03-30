abstract class A
{

	 void test1()
	{
	
	}
	abstract void test2();
}

class G 
{
	public static void main(String[] args) 
	{
		A a1= new A();
		System.out.println("Done");
	}
}

/*
if any class declared as  declared as abstact we can not decaled an object.
CTE
attempting to create object to class A we get CTE.
abstact class means some implimetation gap is there
*/
