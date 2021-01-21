package jdbc.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * jdbc 4단계의 모든 코드를 정리 
 * 특히 ResultSet의 사용법에 주의 
 */
public class DBConnectionTest4 {
	DBConnectionTest4() throws Exception{
		//1. 드라이버 로딩 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로딩 성공....");
		
		//2. 디비 연결
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hr";
		String pass = "hr";
		Connection conn=DriverManager.getConnection(url,user,pass);
		System.out.println("디비 연결 성공....");
		
		//3. statement 생성
		Statement st = conn.createStatement();
		System.out.println("3. statement 객체 생성 성공...");
		
		//4. id = 'kim', name='김제동', age =40;을 한명 추가 
	/*	String query = "INSERT INTO member VALUES('kim','김제동',40)";
		int row = st.executeUpdate(query );
		System.out.println("insert ...ok.");*/
		
		//5. 장나라 라는 이름을 장보고로 수정...update 
		/*String query2 = "UPDATE  member SET name= '장보고' WHERE name= '장나라'";
		int row = st.executeUpdate(query2);
		System.out.println("UPDATE...ok");*/

		//6. 박과장을 삭제
		String query3 = "DELETE FROM member WHERE name ='박과장'";
		st.executeUpdate(query3);
		System.out.println("DELETE...OK...");
		
		//7.member 테이블에 있는 모든 데이타를 가져와서 콘솔로 출력 
		String query4 = "SELECT * FROM member";
		ResultSet rs	=st.executeQuery(query4);
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+
														rs.getString("name")+"\t"+
														rs.getInt("age"));
		}
	}
	public static void main(String[] args) throws Exception {
		new DBConnectionTest4();

	}
}
/*
 * test 라는 테이블 하나 생성... hr 계정에...
 * 컬럼은 id - varchar2(20)
 * 			password- varchar2(20)
 * 			name - varchar2(30)
 * 			tel - number
 * 2. class TestDBConn에서 작성....
 * 2-1. test라는 테이블에 4row가 되도록 데이타를 insert
 * (이때 id - kosta | name = 구유리)
 * (이때 id - hong | name = 홍길동)
 * 2-2. update문을 사용.... kosta를 kosta104로 수정 이때 이름도 함께 수정			
 * 2-3. name이 홍길동인 사람을 삭제, id가 kosta104인 사람도 삭제... //2명 삭제 
 * 2-4. test 테이블에 들어있는 모든 사람들 가져와서 해당콘솔창으로 출력 
 */
