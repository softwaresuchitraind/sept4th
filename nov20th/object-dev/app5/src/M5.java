class A implements Cloneable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	void performClone()
	{
		try
		{
			//we  create a Origional object same is cloned
			A a2 = (A) clone();
			System.out.println(a2.i);
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}

/*
-clone method is protected u have to call with in same subclass
-return type is Object type u have to downcast to the Object type
-clone() is a checked u have to use try and catch
These consitions require for cs
for running

-Objects which are Clonale shold implement Clonable interface

-Clonable is a Marker interface---Any interface without members--does not have any members
-empty interface -only providing a marker 


90
done



clone --getting a duplicate
-By taking the content of the object we create a duplicate object.


4 conditions
-----------
-because of clone() is a protected u have to cretate subclass
-down cast to required, becaause clone() method return type is object type.
-clone() method shold require cloneNotSupportedException
either through try catch or throws.
-If Object is clonable type then only eligible for cloning operation.

//shallow copy

*/