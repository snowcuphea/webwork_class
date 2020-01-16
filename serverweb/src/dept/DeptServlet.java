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
		System.out.println("����Ϸ�");

		PrintWriter pw = response.getWriter();

		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");

		System.out.println("�μ���ȣ: " + deptNo);
		System.out.println("�μ��̸�: " + deptName);
		System.out.println("��ġ: " + loc);
		System.out.println("��ȭ��ȣ: " + tel);
		System.out.println("������: " + mgr);
		
		DeptDTO deptt = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		DeptDAO dao = new DeptDAO();
		int result = dao.insert(deptt);
		
		pw.print("<h1>���Լ���</h1>");
		pw.print("<hr/>");
		pw.print("<h3>"+result+"�� �� ���� ����");
		
		
		
	
		
		
		
		
		
	}

}
