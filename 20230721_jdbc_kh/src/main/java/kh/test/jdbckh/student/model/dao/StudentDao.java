package kh.test.jdbckh.student.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kh.test.jdbckh.student.model.vo.StudentVo;

//db연동
public class StudentDao {
	
//ppt내용구현
	//DB tb_student 테이블의 전달받은 학번을 통해 학생 1명의 상세정보를 읽어옴
	public StudentVo selectOneStudent(String studentNo) {
		StudentVo result = null;
		System.out.println("DAO selectOneStudent() arg:" + studentNo);
		String query = "select * from tb_student join tb_department using(department_no) where student_no = " + "'"+ studentNo + "'";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "kh", "kh");
//			if(conn == null) {
//				System.out.println("연결실패");
//			}else {
//				System.out.println("연결 성공");
//			}
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				result = new StudentVo();
				// while 동작시킬필요없음 query 결과가 단일행일 것이므로 
				result.setAbsenceYn(rset.getString("Absence_Yn"));
				result.setCoachProfessorNo(rset.getString("Coach_Professor_No"));
				result.setDepartmentNo(rset.getString("Department_No"));
				result.setEntranceDate(rset.getDate("Entrance_Date"));
				result.setStudentAddress(rset.getString("Student_Address"));
				result.setStudentName(rset.getString("Student_Name"));
				result.setStudentNo(rset.getString("Student_No"));
				result.setStudentSsn(rset.getString("Student_Ssn"));
				result.setDepartmentName(rset.getString("Department_Name"));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rset!=null) rset.close();
				if(pstmt!= null)pstmt.close();
				if(conn!= null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
	}
	
	
	// DB에서 td_student 테이블의 있는 모든 내용을 읽어서 꺼냄.
	public List<StudentVo> selectListStudent() {
		List<StudentVo> result = null;
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			// 1.ojdbc jar 파일이 있는지 없는지 driver 있다면 로딩 없다면 classnotfoundexception오류발생
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.connection객체를 생성하는 것 //dbms와 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kH", "kh");
			if (conn != null) {
				System.out.println("DB연결 성공!!!!");
			} else {
				System.out.println("------DB연결 실패------");
			}
			//3.statement/preparestatement 객체 생성 - conn 객체로부터 - query문을 실어보냄 
			String query = "select * from tb_student";
			pstmt = conn.prepareStatement(query);
			//4. query 문을 실행해달라고 함. 그 결과 값을 return 받음.
			//select query 문이면 resultset 모양
			//insert/update/delete 문이면 int 모양
			ResultSet rs = pstmt.executeQuery();
			
			//5. ResultSet 에서 row(record)= 한 줄 읽어오기 위해 cursor(포인트)를 이동함.
			result = new ArrayList<StudentVo>();
			
			while(rs.next() == true) {
//				System.out.println( rs.getString("STUDENT_NAME") );  확인용도
				//한 줄 row/record 를 읽을 준비 완료
				StudentVo vo = new StudentVo();
				vo.setStudentName(rs.getString("STUDENT_NAME"));
				vo.setStudentNo(rs.getString("STUDENT_NO"));
				vo.setDepartmentNo(rs.getString("DEPARTMENT_NO"));
				vo.setStudentSsn(rs.getString("STUDENT_SSN"));
				vo.setEntranceDate(rs.getDate("ENTRANCE_DATE"));
				vo.setAbsenceYn(rs.getString("ABSENCE_YN"));
				vo.setCoachProfessorNo(rs.getString("COACH_PROFESSOR_NO"));
				vo.setStudentAddress(rs.getString("STUDENT_ADDRESS"));
				
				result.add(vo);
				
			}
//			stmt = conn.createStatement();
//			pstmt = conn.prepareStatement("");

		} catch (ClassNotFoundException e) {
			// 1.driver (ojdbc.jar) 없음
			e.printStackTrace();
		} catch (SQLException e) {
			// 2. dbms에 연결 실패
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (stmt != null) {
					stmt.close();
				}
				
				if (conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
//		System.out.println(result);
		return result;
	}

}
