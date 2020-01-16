package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//�����۸�ũ���� ��û�����Ƿ� get���
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		System.out.println("����Ϸ�");
		PrintWriter pw = response.getWriter();
		
		//1. ��û���� ����
		String deptNo = request.getParameter("deptNo");
		
		//2.�����Ͻ��޼ҵ� ȣ��
		DeptDAO dao = new DeptDAO();
		int result = dao.delete(deptNo);
		
		//3.����޽��� ����
		response.sendRedirect("/serverweb/dept/list.do");

	}

}
