package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{

       
        Student[] names = {
                new Student("Mohan", 12, "aksh@gmail.com"),
                new Student("Roahn" , 11, "ansh@gmail.com"),
                new Student("ram", 13,"ram@gamil.com"),
                        };
                              

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
        pw.write("<table border='1' align='center' bgcolor = 'yellow'>");
        for(Student next: names){
            
            pw.write("<tr>");
            pw.write("<td><h2>" + next.name + "</h2></td>");
            pw.write("<td><h2>" + next.age + "</h2></td>");
            pw.write("<td><h2>" + next.email + "</h2></td>");
             pw.write("</tr>");
            
        }
        pw.write("</table>");
        pw.write("</body>");
        pw.write("</html>");
        
        pw.close();
    }
}


