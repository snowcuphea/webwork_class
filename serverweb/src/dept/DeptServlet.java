package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		System.out.println("실행완료");

		PrintWriter pw = response.getWriter();

		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");

		System.out.println("부서번호: " + deptNo);
		System.out.println("부서이름: " + deptName);
		System.out.println("위치: " + loc);
		System.out.println("전화번호: " + tel);
		System.out.println("관리자: " + mgr);
		
		DeptDTO deptt = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		DeptDAO dao = new DeptDAO();
		int result = dao.insert(deptt);
		
		pw.print("<h1>삽입성공</h1>");
		pw.print("<hr/>");
		pw.print("<h3>"+result+"개 행 삽입 성공");
		
		
		
	
		
		
		
		
		
	}

}
