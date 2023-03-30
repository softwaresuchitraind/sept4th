class A
{
	final A()
	{
	
	}
}

class M6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
M6.java:3: error: modifier final not allowed here
        final A()
              ^
1 error

constructor can not be final.
constuctors are not inherting to subclass,while declaring a construor as final we are not achieving any thing.
constuctor should not be static.---Wthile object is creating no static method is executing.
constuctors are only for initioalizing object members.
while object is creating constructor has to execute.
constructor should not be abstrac.--as it is not inherited.

*/