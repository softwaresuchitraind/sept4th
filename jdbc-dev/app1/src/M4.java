import java.sql.*;
class M4
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		String s1="INSERT INTO TAB208 VALUES(7,'manu')";
		String s2="UPDATE TAB208 SET FIRST_NAME='KUMAR' WHERE ID=3";
		String s3="DELETE FROM TAB208  WHERE ID=5";
		
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
	
		System.out.println("done");
	}
}