import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsertion {

	public static void main(String[] args) {
				try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Daddymummy$1" );
	        Statement st=con.createStatement();
	        st.addBatch("insert into employee values(1,'AKT',200)");
	        st.addBatch("insert into employee values(2,'Surya',2000)");
	        st.addBatch("insert into employee values(3,'Naresh',2500)");
	        st.executeBatch();
	     
	        ResultSet rs=st.executeQuery("select * from employee");

	        while(rs.next()){
	    	System.out.println("ID::"+rs.getInt(1));
	    	System.out.println("Name::"+rs.getString(2));
	    	System.out.println("Salary::"+rs.getInt(3)); 
	    	
	   }
	        con.close();
		 }
		    catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		}
	
	}

