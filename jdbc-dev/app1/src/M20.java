import java.sql.*;
import java.io.*;
import java.util.*;
class M20
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		//Databasemeta data information
		DatabaseMetaData dbmd=con.getMetaData();
		//several methods of Databasemetadata
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDatabaseProductName());

			
	}
}
/*
G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M20.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath%; M20
Oracle JDBC driver
Oracle
*/