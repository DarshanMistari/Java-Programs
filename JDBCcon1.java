import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
class JDBCcon1
{
	public static void main(String agrs[])
	{
		try{
			//Step 1 Register the Driver
			Driver d =new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver Register Successfully !!!");

			//Step 2 Get Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","Darshan");
			System.out.println("Get Connection SucessFully ..!!");
			
		}
		catch(SQLException ex)
		{
			System.out.println("Error in code..");
		}
	}
}
