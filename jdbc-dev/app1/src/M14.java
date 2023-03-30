import java.sql.*;
import java.io.*;
class M14
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		//we are reading id only
		String sql="SELECT ID FROM TAB208";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			//from same column we can read any number of times
			System.out.print(rs.getString("id") + "\t");
			System.out.print(rs.getString("id") + "\t");
			System.out.print(rs.getString("id") + "\t");
			System.out.println(rs.getString("id") + "\t");
			
		}

		System.out.println("done");
	}
}
/*
G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M14.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath%; M14
1       1       1       1
1       1       1       1
2       2       2       2
3       3       3       3
4       4       4       4
9       9       9       9
6       6       6       6
7       7       7       7
9       9       9       9
9       9       9       9
12      12      12      12
13      13      13      13
100     100     100     100
101     101     101     101
102     102     102     102
103     103     103     103
done
*/