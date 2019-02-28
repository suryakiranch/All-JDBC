import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SensitiveResultSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Daddymummy$1" );
		    Statement s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		    ResultSet rs=s.executeQuery("Select Id,Name,salary from employee ");
		    while(rs.next()){
		    	rs.refreshRow();
		    	System.out.println(rs.getInt(1));
		    	System.out.println(rs.getString(2));
		    	System.out.println(rs.getInt(3));
		    	System.out.println("press enter");
		    	System.in.read();
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
