package selenium;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnecttoadatabaseinSelenium {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","root");
		if(connection.isClosed()) {
			System.out.println("We have not connected to the database");
		}
		else {
			System.out.println("We have successfully connected to the database");
		}
}
}