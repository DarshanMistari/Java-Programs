import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
public class Execute_DynamicQuery_UserInput {
    
    public static void main(String args[])
    {
       try
       {
           //Step 1 Register the Driver
           Driver d = new oracle.jdbc.driver.OracleDriver();
           DriverManager.registerDriver(d);
           System.err.println("Register the Driver is SuccessFully...");

          // Step 2 Get Connection 
          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","Darshan");
          System.err.println("Get Connection is SuccessFully ..."+con);

          // Step 3 Create statemment Object 
          Statement stmt = con.createStatement();
          System.err.println("Statement Object is Created");

        //   Scanner sc = new Scanner(System.in);
        //   System.err.println("Please Enter the ID and Name :");
        //   int id = sc.nextInt();
        //   String name = sc.next();

          //step 4 Execute Query
          //Table is Created
          //stmt.executeUpdate("create table stud(id number(3) , name varchar2(30))");

          //insert Date from Table
          //stmt.executeUpdate("insert into stud values(1,'Darshan Mistari')");
          //stmt.executeUpdate("insert into stud values(2,'Yogesh Badgujar')");
          //stmt.executeUpdate("insert into stud values(3,'Ritesh Badgujar')");
          //stmt.executeUpdate("insert into stud values(4,'Jayesh Badgujar')");
          //stmt.executeUpdate("insert into stud values(5,'Umesh Kuwar')");
          //stmt.executeUpdate("insert into stud values("+ id +",' "+ name +"')");

          //Upadate Data from Table
          //stmt.executeUpdate("update stud set name='Umesh Kuwar' where id=5");

          //Delete Data From Table
          stmt.executeUpdate("delete from stud where id=6");

          //Step 5 Close Connection
          con.close();
       }
       catch(SQLException ex)
       {
        System.err.println("Error in the Code..");
       }
    }
}
