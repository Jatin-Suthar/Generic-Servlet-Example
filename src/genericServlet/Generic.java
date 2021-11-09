package genericServlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Generic extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Generic Servlet Example</h2>");
		out.println("<p>welcome to first project of generic servlet</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
