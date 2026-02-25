package lesson9;

import java.sql.SQLException;

public class BoardInsert {

	public static void main(String[] args) {
		try (DatabaseConnection db =
				new DatabaseConnection(
						"jdbc:oracle:thin:@localhost:1521/XEPDB1",
						"appuser", "appuser123")) {
			//호퍼스
			String sql = """
					insert into board(name, description, created_date)
					values (?, ?, sysdate)
					""" ;
			db.executeQuery(sql, "'너자3", "너자3입니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
