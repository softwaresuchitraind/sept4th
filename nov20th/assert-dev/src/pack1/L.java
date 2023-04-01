package pack1;
import pack1.pack11.M;
import pack2.N;
import pack2.pack22.O;
class L 
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
//G:\nov20th\assert-dev\src>java -cp ../classes -ea:packq.pack11.M pack1.L
/*
difference between throw and assert
................................
1.
-throw statement execute every time we can not enable or disable.
-assert executing whenever we enable it.
-if some rule is optional for some user and mandatory for some other user then go for assert.
2.
-throw specify any object to Exception or error ,it is only for assertion error.

3.

-throw statement always should be last statement in the current block but assert statement
can any where in the method.




1. java -cp ../classes -ea:pack2... pack1.L
//enable in pack2 and subpackages of pack2(pack2.pack22) members

2. java -cp ../classes -ea:pack2.N pack1.L
//enable only in the N class

3. java -cp ../classes -ea -da:pack1... pack1.L
//enable in pack2 and sub packages of pack2(pack2.pack22) memebrs

4. java -cp ../classes -ea -da:pack1... -da:pack2.pack22.O pack1.L
//enable only in N class


*/