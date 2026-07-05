package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
        String[] names = {"Mohan" , "Sohan", "rohan", "Ganseh", "Dinesh", "Vikram", "Kshitij" , "Pooran"};

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<!DOCTYPE html>");
        pw.write("<html lang='en'>");
        pw.write("<head>");
        pw.write("<title>::Servlet Response::</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>My Servlet Response...!!!</h1>");
        pw.write("<hr>");
        for(String next: names){
            pw.write("<h2>" + next + "</h2>");
        }
        pw.write("</body>");
        pw.write("</html>");
        
        pw.close();
    }
}


