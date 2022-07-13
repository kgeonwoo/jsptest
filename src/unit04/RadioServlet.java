package unit04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RadioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		String[] items = request.getParameterValues("item");
		String job = request.getParameter("job");
		String[] interest = request.getParameterValues("interest");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("당신이 입력한 정보입니다.<br>");
		out.print("성  별 : ");
		out.println(gender + "<br>");
		out.print("이메일 수신여부 : ");
		out.println(chk_mail + "<br>");
		out.println("좋아하는 의류들 : ");
		if(items == null) {
			out.print("선택한 항목이 없습니다.<br><br>");
		}else {
			for(int i = 0;i < items.length; i++) {
				if(i + 1 == items.length) {
					out.println(items[i] + "<br><br>");
					break;
				}
				out.println(items[i] + ",");
			}			
		}
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
		out.print("직업 : ");
		if(job == "") {
			out.print("선택한 항목이 없습니다.<br><br>");
		}else {
			out.println(job + "<br>");					
		}
		out.print("가입인사말 : ");
		out.println(content);
		out.println("<br><a href='javascript:history.go(-1)'>되돌아가기</a>");
		out.println("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
