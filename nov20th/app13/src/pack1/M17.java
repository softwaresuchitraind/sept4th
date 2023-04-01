package pack1;
import java.io.*;
import java.sql.*;
class M17
{
	public static void main(String[] args) 
		throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt = con.createStatement();
		String sql = "SELECT ID p_id, AGE person_age FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnName(2));
		while(rs.next())
		{
			System.out.print(rs.getString("p_id") +", ");
			System.out.print(rs.getString("person_age") +", ");
			System.out.println();
		}
		System.out.println("done");
	}
}
/*
select command comes under dql for that we have to use executeQuery();
*/