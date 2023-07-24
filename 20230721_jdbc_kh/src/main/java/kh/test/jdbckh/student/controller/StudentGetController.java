package kh.test.jdbckh.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.jdbckh.student.model.dao.StudentDao;
import kh.test.jdbckh.student.model.vo.StudentVo;

/**
 * Servlet implementation class StudentGetConroller
 */
@WebServlet("/student/get")
public class StudentGetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentGetController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentNo = request.getParameter("sno");
		System.out.println(studentNo);
		// TODO 학생 상세 정보 가져오기 
		//2. 전달받은 데이터를 활용해 학생 상세 정보 가져오기 
		StudentDao dao = new StudentDao();
		StudentVo vo = dao.selectOneStudent(studentNo);
		System.out.println("ysysysysysysys");
		System.out.println(vo);
		request.setAttribute("svo", vo);
		request.getRequestDispatcher("/WEB-INF/view/student/get.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
