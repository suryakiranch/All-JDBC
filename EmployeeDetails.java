import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your ID: ");
		
		int Id = scanner.nextInt();
		System.out.println("Enter your Name");
		

		String Name=scanner.next();		
		System.out.println("Enter your salary");
		
		int  salary=scanner.nextInt();
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Daddymummy$1" );
		    Statement s=con.createStatement();
		    s.executeUpdate("insert into employee values("+Id+ ", '"+Name+"',"+salary+")");
		    System.out.println("Id inserted is::"+Id);
		    System.out.println("Name inserted is::"+Name);
		    System.out.println("Salary inserted is::"+salary);
		    con.close();
		 }
		    catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
      }
	}