package DataAccess;

import java.sql.*;

public class DBConnection {
	Connection c = null;

	public DBConnection() {
	}
    private String userName = "root";
    private String password = "dursun458669";
    private String dbUrl = "jdbc:mysql://localhost:3306/hospital";

	public Connection connDb() {
		try {
			this.c = DriverManager.getConnection(dbUrl,userName,password);
			return c;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return c;
	}
}