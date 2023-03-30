package pack1;
import pack1.pack11.M;
import pack2.N;
import pack2.pack22.O;
class  L
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false;
		System.out.println(2);
		pack1.pack11.M.test2();
		System.out.println(3);
		pack2.pack22.O.test4();
		System.out.println(4);
		pack2.N.test3();
		System.out.println(5);
	}
}

/*

G:\sept4th\assert-dev\src>javac -d ../classes pack1/L.java
G:\sept4th\assert-dev\src>java -cp ../classes -ea pack1.L
1
Exception in thread "main" java.lang.AssertionError
        at pack1.L.main(L.java:10)

G:\sept4th\assert-dev\src>java -cp ../classes -ea:pack2... pack1.L
1
2
pack1.pack11.M.test2 begin
pack1.pack11.M.test2 end
3
pack2.pack22.O.test4 begin
Exception in thread "main" java.lang.AssertionError
        at pack2.pack22.O.test4(O.java:7)
        at pack1.L.main(L.java:14)

-ea:pack2...  >package wise assert members are enabled from pack2 and subpackages of pack2.



G:\sept4th\assert-dev\src>java -cp ../classes -ea -da:pack1... pack1.L
1
2
pack1.pack11.M.test2 begin
pack1.pack11.M.test2 end
3
pack2.pack22.O.test4 begin
Exception in thread "main" java.lang.AssertionError
        at pack2.pack22.O.test4(O.java:7)
        at pack1.L.main(L.java:14)

-ea enabling everywhere then disable




G:\sept4th\assert-dev\src>java -cp ../classes -ea:pack2.N  pack1.L
1
2
pack1.pack11.M.test2 begin
pack1.pack11.M.test2 end
3
pack2.pack22.O.test4 begin
pack2.pack22.O.test4 end
4
pack2.N.test3 begin
Exception in thread "main" java.lang.AssertionError
        at pack2.N.test3(N.java:7)
        at pack1.L.main(L.java:16)

by default disabling everywhere we are enabling N
-ea ......package name or class name/if package name ... required



G:\sept4th\assert-dev\src>java -cp ../classes -ea:pack2... -da:pack2.pack22.O  pack1.L
1
2
pack1.pack11.M.test2 begin
pack1.pack11.M.test2 end
3
pack2.pack22.O.test4 begin
pack2.pack22.O.test4 end
4
pack2.N.test3 begin
Exception in thread "main" java.lang.AssertionError
        at pack2.N.test3(N.java:7)
        at pack1.L.main(L.java:16)

enabing entire


Try to run
----------------
1. java -cp ../classes -ea:pack2... pack1.L
	enable in pack2 and sub packages of pack2(pack2.pack22)members

2.java -cp ../classes -ea:pack2.N pack1.L
  enable only in the N class

3. java -cp ../classes -ea -da:pack1... pack1.L
enable in pack2 and sub packages of pack2(pack2.pack22) members


4.java -cp ../classes -ea -da:pack1... -da:pack2.pack22.O pack1.L
enable only in the N class


*/
