package lesson8;

import java.sql.*;

public class DBConnectionTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"appuser", "appuser123");
			stmt = con.createStatement();

			rs = stmt.executeQuery("select * from board");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name")
				+ " " + rs.getString("description")
				+ " " + rs.getTimestamp("created_date"));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			if (con != null)
				con.close();
			} catch (SQLException ignored) {

			}
		}
	}

}
