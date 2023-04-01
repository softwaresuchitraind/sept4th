package pack1;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
class M19
{
	public static void main(String[] args) 
		throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter table name");
		String tableName = sc.next();
		String sql = "SELECT * FROM "+ tableName;
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		for(int i=1;i<cols;i++)
		{
			System.out.print(rsmd.getColumnName(i)+ "\t");
		}
		System.out.println();
		System.out.println("==============================================");
		while(rs.next())
		{
			for(int i=1;i<cols;i++)
			{
				System.out.print(rs.getString(i)+ "\t");
			}
			System.out.println();
		}
		System.out.println("done");
	}
}
/*
select command comes under dql for that we have to use executeQuery();
*/