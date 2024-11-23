import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
class JDBCcon3
{
	public static void main(String args[])
	{
		try
		{
			//step 1 Register the Deriver 
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Register Driver SucessFully ..");

			//Step 2 Get Connection 
			Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","Darshan");
			System.out.println("Get Connection is Sucessfully.. Connection id :"+con);

			//Step 3 Create  Statement Object
			Statement stmt = con.createStatement();
			System.out.println("Statement Object is Created..");

			//Step 4 Execute the Query
			//stmt.executeUpdate("create table stud(id number(3), name varchar2(30))");

			//insert Data
			//stmt.executeUpdate("insert into stud values(1 , 'Darshan Mistari')");
			//stmt.executeUpdate("insert into stud values(2,'Yogesh Badgujar')");

			//stmt.executeUpdate("insert into stud values(3,'Yogesh Badgujar')");


			//Delete Data
			//stmt.executeUpdate("delete from stud where id=3");
			System.out.println("Execute the Query");

			//Update Data
			stmt.executeUpdate("update stud set name='Ritesh Badgujar' where id=3");

			//Step 5 Connection Close
			con.close();
			System.out.println("Connection is Closes");
		}
		catch(SQLException ex)
		{
			System.out.println("Error in Code...");
		}
	}
}