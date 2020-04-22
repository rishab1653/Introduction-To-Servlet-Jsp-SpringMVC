package practice;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/helloservlet")
public class HelloWorldServlet extends HttpServlet
{
    public void  service(HttpServletRequest request , HttpServletResponse response) throws IOException {
            PrintWriter printwriter = response.getWriter();


        printwriter.print("<!Doctype html>");
        printwriter.print("<html>");
        printwriter.print("<head>");
        printwriter.print("<title>Hello World Servlet!</title>");
        printwriter.print("</head>");
        printwriter.print("<body>");
        printwriter.print("<p>Hello, I AM SERVLET!</p>");
        printwriter.print("</body>");
        printwriter.print("</html>");
        printwriter.close();

        }
}
