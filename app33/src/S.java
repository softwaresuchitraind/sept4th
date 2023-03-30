//IMP
class  S
{
	final int i;
	S()
	{
		i=10;
	}
	S(int x)

	{
		i=20;
	}
}
/*
cs
While object is creating only one consturtor is executing.
there is no attempt to modify.
While providing multiple construtor----multiple ways of object creation--
--i is a constant for one object-
* non static global final is not perfect constant it is cnstant for only
one object
-other objects may have same value or different value.
*/