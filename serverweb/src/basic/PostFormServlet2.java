package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//������̼� : ������ ������ ��ȣ�� ǥ���ؼ� �����Ϸ����� �˷��ִ� ��. 
@WebServlet(name = "mypost2", urlPatterns = { "/mypost2.do" })
//�̷��� ���ָ� web.xml�� �ۼ��� �Ͱ� �����ϰ� �۵��Ѵ�. 
//�ߺ��� ������ �ȵȴ�. 
public class PostFormServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();//��¿�����Printwriter�� ���� ����. ������
		//��û��������
		String id = request.getParameter("userId");
		String username = request.getParameter("userName");
		String pass = request.getParameter("passwd");
		String gender= request.getParameter("gender");
		String job = request.getParameter("job");
		String[] fav = request.getParameterValues("item");
		
		//���䳻�����
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>������</h1>");
		pw.print("<h3>���̵�:"+id+"</h3>");
		pw.print("<h3>����: "+username+"</h3>");
		pw.print("<h3>Favorites</h3>");
		for(String data:fav) {
			pw.print(data+" ");
		}

		pw.print("</body>");
		pw.print("</html>");
		
	
		
		
		
	}

}
