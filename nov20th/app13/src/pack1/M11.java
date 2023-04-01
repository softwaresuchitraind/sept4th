package pack1;
import java.io.*;
class M11 
{
	public static void main(String[] args) 
		throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system ","Prafulla#68");
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getInt("id") +", ");
			System.out.print(rs.getString("name") +", ");
			System.out.print(rs.getInt("age"));
			System.out.println();
		}
		System.out.println("done");
	}
}
/*
select command comes under dql for that we have to use executeQuery();
*/