abstract class A
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test5();
}

/*
Even though all the methods are abstract,it is not 100% abstact.
No class can be 100% abstract because of constructor.
every class should have a minimum one constructor.
constructor always non static as it is involved in 
non static initialization.
constructor can not be abstact.
constuctors are not inherinting to subclass 
where it is implimented.
constuctor is always concrete.


-Every class should have one constuctor
Why constror always concrete, why not constructor is abstract ?
constructor is not inheriting to subclass,
so we can not declare constror as abstract.

*/