package unit04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name = request.getParameter("name");
		String mem_num_f = request.getParameter("mem_num_f");
		String mem_num_b = request.getParameter("mem_num_b");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pw_re = request.getParameter("pw_re");
		String email_f = request.getParameter("email_f");
		String email_b = request.getParameter("email_b");
		String email_c = request.getParameter("email_c");
		String addr_num = request.getParameter("addr_num");
		String addr_f = request.getParameter("addr_f");
		String addr_b = request.getParameter("addr_b");
		String p_n = request.getParameter("p_n");
		String job = request.getParameter("job");
		String chk_mail = request.getParameter("chk_mail");
		String[] interest = request.getParameterValues("interest");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		
			out.print("이름 : ");
			out.println(name + "<br>");
			
			out.print("주민번호 : ");
			out.println(mem_num_f + "-" + mem_num_b + "<br>");
			
			out.print("아이디 : ");
			out.println(id + "<br>");
			
			out.print("비밀번호 : ");
			out.println(pw + "<br>");
			
			out.print("이메일 : ");
			if(email_b == "") {
				out.println(email_f + "@" + email_c + "<br>");
			}else {			
				out.println(email_f + "@" + email_b + "<br>");
			}
			
			out.print("우변번호 : ");
			out.println(addr_num + "<br>");
			
			out.print("주소 : ");
			out.println(addr_f + "-" + addr_b + "<br>");
			
			out.print("핸드폰번호 : ");
			out.println(p_n + "<br>");
			
			out.print("직업 : ");
			out.println(job + "<br>");
			
			out.print("이메일 수신여부 : ");
			out.println(chk_mail + "<br>");
			
			out.println("관심분야 : ");
			if(interest == null) {
				out.print("선택한 항목이 없습니다.<br><br>");
			}else {
				for(int i = 0;i < interest.length; i++) {
					if(i + 1 == interest.length) {
						out.println(interest[i] + "<br><br>");
						break;
					}
					out.println(interest[i] + ",");
				}			
			}
		
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.println("</body></html>");
		out.close();
	}

}
