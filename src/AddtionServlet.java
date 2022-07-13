

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddtionServlet")	//에노테이션 정보
public class AddtionServlet extends HttpServlet {	//서블릿 클래스가 되기 위해서는 HttpServlet Class를 상속받아야한다.
	
	private static final long serialVersionUID = 1L;
       
    public AddtionServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Addition</title></head></html>");
		out.println("<body>");
		out.println(num1 + "+" + num2 + "=" + add);
		out.println("</body>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	//기본적으로 get, post 메소드로 서버쪽에 request한다
}