import java.sql.*;
import java.io.*;
import java.util.*;
class M18
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Table Name");
		String name=sc.next();
		String sql="SELECT * FROM " + name;
		ResultSet rs=stmt.executeQuery(sql);
		ResultSetMetaData rsmd=rs.getMetaData();
		int cols=rsmd.getColumnCount();
		while(rs.next())
		{
			for(int i=1;i<=cols;i++)
			{
				System.out.print(rs.getString(i) + "\t");
			}
		
			System.out.println();	
		}
	}
}

/*
Extracting data from one of the available table


G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M18.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath% M18
Enter Table Name
TAB208
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

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath% M18
Enter Table Name
TAB209

*/
