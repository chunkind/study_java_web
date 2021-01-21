package jdbc.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 1단계 : 드라이버 로딩 
 * 2단계 : 디비연결 
 */
public class DBConnectionTest2 {
	DBConnectionTest2() {
		// 1.드라이버 로딩...
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading ....ok...");
			// 2.디비 연결(특정한 디비서버의 주소로 직접 연결한다)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521 ";
			Connection con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("DBconnectting.....fail....");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading ....fail...");
		} catch (SQLException e) {
			System.out.println("DBconnectting.....fail....");
		}
	}

	public static void main(String[] args) {
		new DBConnectionTest2();

	}
}
