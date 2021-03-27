package helloPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest reqest,HttpServletResponse responce)
	throws IOException,ServletException{
		/**
		 * setContentTypeはブラウザ上でどんなファイルを送るかを指定することができる
		 * text/html、text/css、text/js等
		 * image/png、image/jpegでも可能
		 */
		responce.setContentType("text/html; charset=UTF-8;");
		//charsetはWindows-31JかEUC_JPのどちらかを指定しないと文字化けする
		//出力
		PrintWriter out = responce.getWriter();
		out.println("<body>");
		out.println("<h1>なんでやねん</h1>");
		out.println("<body>");
	}
}