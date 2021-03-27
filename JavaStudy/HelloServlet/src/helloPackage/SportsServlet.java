package helloPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SportsServlet
 */
@WebServlet("/SportsServlet")
public class SportsServlet extends HttpServlet {

	String sports[] = new String[10];

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメーターの文字コードの指定
		request.setCharacterEncoding("UTF-8");
		//リクエストパラメーターの取得
		String sport[] = request.getParameterValues("sports");
		sports =sport;
	}
	public void doGet(HttpServletRequest request, HttpServletResponse responce) throws IOException,ServletException{
		responce.setContentType("text/html; charset=UTF-8");
		PrintWriter out = responce.getWriter();
		out.println("<body>");
		for(int i =0;i<10;i++) {
			out.println("<p>"+sports[i]+"</p>");
		}
		out.println("<body>");
	}
}
