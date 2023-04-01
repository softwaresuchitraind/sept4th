enum E
{
	C1, C2, C3, C4;
}
class F 
{
	public static void main(String[] args) 
	{
		System.out.println(E.C1);
		System.out.println(E.C3);
	}
}

/*
C1
C3
-Inside a enum we are incorporating 4 unique constants all should be unique.
-Every constant should be represented through java valid identifier.
-All should be separated with comma.
-All are static and final.
-Here not only static and final it is public also.
-By default enum is not public only members are public
-By default interface is not a public but evry members of interface is public.

-if u want enum public u have to specify explicitely.

*/