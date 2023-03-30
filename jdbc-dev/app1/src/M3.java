import java.sql.*;
class M3
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		Statement stmt=con.createStatement();
		String s1="INSERT INTO TAB210 VALUES(2,'Kiran')";
		String s2="INSERT INTO TAB210 VALUES(3,'babu')";
		String s3="INSERT INTO TAB210 VALUES(4,'murali')";
		String s4="INSERT INTO TAB210 VALUES(5,'chethan')";
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		System.out.println("done");
	}
}
/*

G:\sept4th\jdbc-dev\app1\classes>cd ..

G:\sept4th\jdbc-dev\app1>cd src

G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M3.java

G:\sept4th\jdbc-dev\app1\src>cd ../classes

G:\sept4th\jdbc-dev\app1\classes>java M3
done

-After getting statement object we can send any number of sql commands
*/