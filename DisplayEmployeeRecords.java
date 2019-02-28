import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayEmployeeRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Daddymummy$1");
	    Statement s=con.createStatement();
	    ResultSet rs=s.executeQuery("select * from employe");

    while(rs.next()){
	System.out.println("Name::"+rs.getString(1));
	System.out.println("Phone::"+rs.getInt(2));
	
}
con.close();
    
       } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}       
      	}
}