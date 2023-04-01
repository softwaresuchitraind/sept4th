class A
{

}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(), a2 = new A(), a3 = new A();
		a1 = null;
		System.out.println("done");
	}
}

/*
done
How many objects getting abadoned ?
only one object is getting abadoned.


*/