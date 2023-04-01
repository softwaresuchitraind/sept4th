import java.util.ArrayList;

@SuppressWarnings({"unchecked", "deprecation"})

class M19 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(90);
		list.add(90);
		System.out.println(list);
		Thread t1 = new Thread();
		t1.stop();
	}
}

/*
G:\nov20th\annotiations-dev\src>javac -d ../classes M19.java
Note: M19.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: M19.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.


-inside Thread class stop() got depricated.


*/