import java.sql.*;
class  M22
{
	public static void main(String[] args) 
	{
		//Declaration of variable
		String driverClass="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="Prafulla#68";
		//Driver registration
		try
		{
			Class.forName(driverClass);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		//it is declarerd outside to use in the finally
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;

		try
		{
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			//composing sql command
			String sql="SELECT * FROM TAB208";
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.print(rs.getInt(1) + "\t");
				System.out.println(rs.getString(2));
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			//close all in reverse order
			try
			{
				if(rs!=null)//checking initialization as declared before try
				{
					rs.close();//close() require SQLEXception
					rs=null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt=null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(con!=null)
				{
					con.close();
					con=null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("done");
	}
}

/*
G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M22.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%classpath%; M22
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
done



Resultsetmetata
Databasemetadata has not close()
*/