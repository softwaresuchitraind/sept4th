package pack1;
import java.io.*;
import java.sql.*;
class M15
{
	public static void main(String[] args) 
		throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:XE ","system","Prafulla#68");
		Statement stmt = con.createStatement();
		String sql = "SELECT ID p_id, AGE person_age FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			//Any column we can read getString()
			System.out.print(rs.getString(1) +", ");
			System.out.print(rs.getString(2) +", ");
			System.out.println();
		}
		System.out.println("done");
	}
}
/*
select command comes under dql for that we have to use executeQuery();
*/