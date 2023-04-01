class A
{
	protected void finalize()
	{
		System.out.println("from finalize()");
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();//object gets live
		a1 = null;//object become abadoned
		//System.gc();//it is not a command ,it is request
		Runtime.getRuntime().gc();
		System.out.println("done");
	}
}
/*
from finalize()
done


-finalize() method is a protected method, it can not be used outside.
-It is executing by garbage collector.
when it is executing
Whenever object is removing from memory,
finalize() method executing by garbage collector.


-once object is becoming abandoned then that object is eligible
for garbage collection.

-garbage collector  removing by memory.

which object is called abadoned object.
-if object does not have a single reference variable then that is called as abadoned obejct.

-if object having no reference variable that is called abadoned object and that is removing from memory.


-if object containing minimum one reference varibale that is called live
object, if object does not contain in a single reference variable then that
object is called abadoned object.

-Garbage collector removing that object from the memory by finalize().

-u can not guarentee when object is removing from the memory.

-on any object garbage collector calling finalize() method only
mazimum one time.0 or one.


resuuection
------------
getting a live again ---regeneration


*/
