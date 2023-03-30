import java.sql.*;
import java.io.*;
import java.util.*;
class M40
{
	public static void main(String[] args)
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Prafulla#68");
		//Databasemeta data information
		DatabaseMetaData dbmd=con.getMetaData();
		//several methods of Databasemetadata
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDatabaseProductName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

			
	}
}