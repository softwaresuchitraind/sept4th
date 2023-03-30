class A
{
	int i;
	A ref;
	A last;
	A(int i)
	{
	 this.i=i;
	}
	void add(int i)
	{
		A element= new A(i);
	    if(ref==null)
		{
			last=ref=element;//both last -ref----2nd element
		}
		else
		{
			last.ref=element;
			last=element;//last pointing to last element
		}
	}
	void iterate()
	{
		A current=this;
		while(current !=null)
		{
			System.out.println(current.i);
			current=current.ref;
		}
		
	}
}
class M10
{
	public static void main(String[] args) 
	{
		A a1= new A(10);//1----i=10,ref-nulll,last== null//10 is storing element,,ref=null,last=null
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(90);
		
		a1.iterate();
	}
}
/*
10
20
30
40
50

*/