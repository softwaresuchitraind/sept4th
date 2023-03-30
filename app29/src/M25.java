class M25
{
	public static void main(String[] args) 
	{
		Object obj =new D();
		A a1=(A)obj;
		System.out.println(" ----------");
		B b1=(B)obj;
		System.out.println(" ----------");
		C c1=(C)obj;
		System.out.println(" ----------");
		D d1=(D)obj;
		System.out.println(" ----------");
		E  e1=(E)obj;
		System.out.println("..............");
	}
}

/*
class cast exception at line no 14


 ----------
 ----------
 ----------
 ----------
Exception in thread "main" java.lang.ClassCastException: D cannot be cast to E
        at M25.main(M25.java:14)
*/