package factory;

import java.sql.Connection;
import java.sql.DriverManager;

import lombok.Data;
@Data
public class Oracle implements Database{
	private Connection conn;
	private String driver, url, user, password;
	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			//oracle.jdbc.OracleDriver
			Class.forName("props.");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}




/*private Connection conn;
private String driver, url, user, password;
@Override
public Connection connect() {
	Connection conn = null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return conn;
}*/