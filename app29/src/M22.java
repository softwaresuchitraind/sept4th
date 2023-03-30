class M22
{
	public static void main(String[] args) 
	{
		B b1=new C();
		C c1=(C)b1;
		System.out.println(" ----------");
		D d1=(D)b1;//it does not have D member
		System.out.println(" done");
	}
}
/*
class cast exception --runtime


 ----------
Exception in thread "main" java.lang.ClassCastException: C cannot be cast to D
        at M22.main(M22.java:8)
*/