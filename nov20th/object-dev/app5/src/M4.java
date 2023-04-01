class A
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
			A a2 = (A) clone();
			System.out.println(a2.i);
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.performClone();
		System.out.println("done");
	}
}

/*
-If Object is atype of Clonable then it is able to cloneing

G:\nov20th\object-dev\app5\src>java -cp ../classes M4
java.lang.CloneNotSupportedException: A
        at java.lang.Object.clone(Native Method)
        at A.performClone(M4.java:12)
        at M4.main(M4.java:27)
done



-cloning can not be done on any of the object by default.
-to do the cloning operation , object should be a type of clonable.

-Cloneable is a marker interface, it does not have any members



*/