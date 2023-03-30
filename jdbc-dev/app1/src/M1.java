import java.sql.*;
class  M1
{
	public static void main(String[] args) throws Exception
	{
		//1.registering a driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2.establishing a db connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system ","Prafulla#68");

		//3.creating statement to send sql command
		Statement stmt=con.createStatement();

		//4.composing sql command
		String sql="CREATE TABLE TAB210(ID NUMBER,FIRST_NAME VARCHAR2(9))";

		//5.send sql command to db
		stmt.execute(sql);
		
		//6.closing all db resources
		stmt.close();
		con.close();
		System.out.println("done");
	}
}
