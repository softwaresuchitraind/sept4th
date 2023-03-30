import java.sql.*;
import java.io.*;
class M17
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		String sql="SELECT * FROM TAB208";
		ResultSet rs=stmt.executeQuery(sql);
		ResultSetMetaData rsmd=rs.getMetaData();
		int cols=rsmd.getColumnCount();
		while(rs.next())
		{
			//for every row for name is executing
			for(int i=1;i<=cols;i++)
			{
				System.out.print(rs.getString(i) + "\t");
			}
		
			System.out.println();	
		}
	}
}
/*

G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M17.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath% M17
1       RAMU
1       RAMU
2       Kiran
3       KUMAR
4       murali
9       8
6       manu
7       manu
9       ss
9       sss
12      suchitra
13      suchitra1
100     manu
101     ramana
102     mohan
103     kumar
*/