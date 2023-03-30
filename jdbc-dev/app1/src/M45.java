import java.sql.*;
class  M45
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
		

		try
		{
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			//composing sql command
			String sql1="INSERT INTO TAB208 VALUES(401,'ABC')";
			String sql2="INSERT INTO TAB208 VALUES(402,'XYZ')";
			String sql3="INSERT INTO TAB208 VALUES(403,HELLO')";//not triggered----syntax error
			String sql4="INSERT INTO TAB208 VALUES(404,'RAMU')";
			//set commit option
			con.setAutoCommit(false);
			stmt.execute(sql1);
			System.out.println("sql1 triggered");
			stmt.execute(sql2);
			System.out.println("sql2 triggered");
			stmt.execute(sql3);//gives exception
			System.out.println("sql3 triggered");
			stmt.execute(sql4);
			System.out.println("sql4 triggered");
			con.commit();//if commit executes all data executed
			
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
			try
			{
				if(con !=null)
				{
					con.rollback();
				}
			}
			catch (SQLException ex1)
			{
				ex1.printStackTrace();
			}
		}
		finally
		{
			
			
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
Transaction management--------mananaging multiple SQL commands under one transaction
inside a transaction boundary any number of SQL commands to send the database
if one is failed other failed autometically.
no records inserted
401 and 402 is not inserted
G:\sept4th\jdbc-dev\app1\src>javac -d ../classes M45.java

G:\sept4th\jdbc-dev\app1\src>java -cp ../classes;%CLASSPATH% M45
sql1 triggered
sql2 triggered
java.sql.SQLException: ORA-01756: quoted string not properly terminated

        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:440)
        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:396)
        at oracle.jdbc.driver.T4C8Oall.processError(T4C8Oall.java:837)
        at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:445)
        at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:191)
        at oracle.jdbc.driver.T4C8Oall.doOALL(T4C8Oall.java:523)
        at oracle.jdbc.driver.T4CStatement.doOall8(T4CStatement.java:193)
        at oracle.jdbc.driver.T4CStatement.executeForRows(T4CStatement.java:999)
        at oracle.jdbc.driver.OracleStatement.doExecuteWithTimeout(OracleStatement.java:1315)
        at oracle.jdbc.driver.OracleStatement.executeInternal(OracleStatement.java:1890)
        at oracle.jdbc.driver.OracleStatement.execute(OracleStatement.java:1855)
        at oracle.jdbc.driver.OracleStatementWrapper.execute(OracleStatementWrapper.java:304)
        at M45.main(M45.java:40)
done

*/