package kh.test.jdbckh.common.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTemplate {
	
	// SingleTon 패턴 Connection 객체가 많이 생성됨을 방지
	public Connection getConnection() {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","kh","kh");
	}
}
