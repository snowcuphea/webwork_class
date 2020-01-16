package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.member.exam.MemberDTO;


@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		System.out.println("����Ϸ�");

		PrintWriter pw = response.getWriter();
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> deptli = dao.getDeptList();

		int size = deptli.size();
		
		pw.print("<h1>�μ���Ϻ���</h1>");
		pw.print("<table border=1>");
		pw.print("<tr>");
		pw.print("<th>�μ��ڵ�</th>");
		pw.print("<th>�μ��̸�</th>");
		pw.print("<th>�μ���ġ</th>");
		pw.print("<th>�μ���ȣ</th>");
		pw.print("<th>������</th>");
		pw.print("<th>����</th>");
		pw.print("</tr>");
		
		for(int i=0;i<size;i++) {
			DeptDTO dept = deptli.get(i);
			pw.print("<tr>");
			pw.print("<td>"+dept.getDeptNo()+"</td>");
			pw.print("<td>"+dept.getDeptName()+"</td>");
			pw.print("<td>"+dept.getLoc()+"</td>");
			pw.print("<td>"+dept.getTel()+"</td>");
			pw.print("<td>"+dept.getMgr()+"</td>");
			pw.print("<td><a href='/serverweb/dept/delete.do?deptNo="
						+dept.getDeptNo()+"&info=test'>����</a></td>");
			pw.print("</tr>");
		}
		pw.print("</table>");
		
		
		
		
		
		
		
	}

}
