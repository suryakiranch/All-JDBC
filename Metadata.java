import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Metadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Daddymummy$1" );
		    //Statement s=con.createStatement();
		    DatabaseMetaData dbm=con.getMetaData();
		    System.out.println(dbm.getDatabaseProductName());
		    System.out.println(dbm.getDatabaseProductVersion());
		    System.out.println(dbm.getDriverMajorVersion());
		    System.out.println(dbm.getDatabaseMajorVersion());
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
