import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordsPrepare {

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
		    PreparedStatement ps= con.prepareStatement("insert into employee values(?,?,?)");
		    ps.setInt(1,Id);
		    ps.setString(2,Name);
		    ps.setInt(3,salary);
		    int s=ps.executeUpdate();
		    System.out.println("Id inserted is::"+Id);
		    System.out.println("Name inserted is::"+Name);
		    System.out.println("Salary inserted is::"+salary);
		    System.out.println(s);
		    con.close();
		 }
		    catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
      }
}
