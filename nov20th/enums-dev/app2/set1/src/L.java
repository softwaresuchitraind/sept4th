enum K
{
	t1, t2, t3, t4
}
class L
{
	public static void main(String[] args) 
	{
		K k1 = K.t3;
		System.out.println(k1);
		k1 = K.t1;
		System.out.println(k1);
		k1 = K.t5;
		System.out.println(k1);
	}
}

/*
cte
-We should not refer constant which is not available.
-If enum containing only list of constants semicolon is nt mandatory.
-if enum contains constructor,fileds or methods it is mandatory.

*/