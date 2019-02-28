import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatement {

	public static void main(String[] args) {
		
		try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Daddymummy$1" );
                java.sql.CallableStatement cst=con.prepareCall("{call Sub(?,?,?)}");
			    cst.setInt(1,40);
			    cst.setInt(2,20);
			    cst.registerOutParameter(3,Types.INTEGER);
			    cst.execute();
			    int res=cst.getInt(3);
			    System.out.println(res);
			} 
				catch (Exception e) {
				e.printStackTrace();
			}
			
	}

}
