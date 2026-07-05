package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();
    
        pw.write("<html>");
        pw.write("<head>");
        pw.write("<title>Servlet Response</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>My Servlet Response...!!!</h1>");
        pw.write("<hr>");
        pw.write("<p>Hii everbody !!!</p>");
        pw.write("</body>");
        pw.write("</html>");
        
        pw.close();
    }
}